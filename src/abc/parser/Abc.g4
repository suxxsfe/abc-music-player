/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: head body EOF;

head: x t (c | l | m | q | v)* k;

x: 'X:' NUMBER NEWLINE;
t: 'T:' (LETTER | NUMBER | CHAR | SPACES)+ NEWLINE;
c: 'C:' NEWLINE;
l: 'L:' NUMBER '/' NUMBER NEWLINE;
m: 'M:' NUMBER '/' NUMBER NEWLINE;
q: 'Q:' NUMBER '/' NUMBER '=' NUMBER NEWLINE;
v: 'V:' NEWLINE;
k: 'K:C' NEWLINE;

NOTECHAR: [a-gA-G];
NUMBER: DIGIT+;
DIGIT: [0-9];
LETTER: [a-zA-Z];
CHAR: [\.\-];

body: voice (NEWLINE voice)* NEWLINE?;
voice: (section SECTIONBAR)+;
section: segment (BAR segment)*;
element: SPACES? (rest | note | chord | tuplet) SPACES;
segment : element (element)*;

rest: REST length?;
note: (ACCIDENTAL)? NOTECHAR (OCTAVE)? length?;
chord: '[' note+ ']';
tuplet: '(' TUPLETLENGTH note+;
length: NUMBER | (NUMBER? '/' NUMBER?);

SECTIONBAR: '||' | '[|' | '|]';
BAR: ('|' | ':|' | '|:') ('[1' | '[2')?;
REST: 'z';
TUPLETLENGTH: '2' | '3' | '4';
ACCIDENTAL: '^' | '^^' | '=' | '_' | '__';
OCTAVE: '_'+ | '\''+;

SPACES: [ ]+;
NEWLINE: '\r'? '\n';

