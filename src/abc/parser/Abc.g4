/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: segment EOF;

head: x t  k;
x: 'X:' INDEX NEWLINE;
t: 'T:' NEWLINE;
c: 'C:' NEWLINE;
l: 'L:' NUMBER '/' NUMBER NEWLINE;
m: 'M:' NUMBER '/' NUMBER NEWLINE;
q: 'Q:' NUMBER '/' NUMBER '=' NUMBER NEWLINE;
v: 'V:' NEWLINE;
k: 'K:C' NEWLINE;

body: (voice NEWLINE)+;
voice: (section SECTIONBAR)+ NEWLINE;
section: segment (BAR segment)*;
element: rest | note | chord | tuplet;

rest: REST length?;
note: (ACCIDENTAL)? NOTECHAR (OCTAVE)? (length)?;
chord: '[' note+ ']';
tuplet: '(' TUPLETLENGTH note+;
length: NUMBER? '/' NUMBER?;

SECTIONBAR: '||' | '[|' | '|]';
BAR: ('|' | ':|' | '|:') ('[1' | '[2')?;
REST: 'z';
TUPLETLENGTH: '2' | '3' | '4';
ACCIDENTAL: '^' | '^^' | '=' | '_' | '__';
OCTAVE: '_'+ | '\''+;

NUMBER: [1-9][0-9]*;
INDEX: [0-9]+;

SPACES: [ ]+;
NEWLINE: '\r'? '\n';

segment : NOTECHAR (SPACES NOTECHAR)*;
NOTECHAR: [a-zA-Z]+;

