/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: head body EOF;

head: x t (c | l | m | q | v)* k;

ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';

x: 'X:' NUMBER NEWLINE;
t: 'T:' (LETTER | NUMBER | CHAR | SPACES | NOTECHAR)+ NEWLINE;
c: 'C:' (LETTER | NUMBER | CHAR | SPACES | NOTECHAR)+ NEWLINE;
l: 'L:' NUMBER DIV NUMBER NEWLINE;
m: 'M:' NUMBER DIV NUMBER NEWLINE;
q: 'Q:' NUMBER DIV NUMBER ACCIDENTAL NUMBER NEWLINE;
v: 'V:' (LETTER | NUMBER | CHAR | SPACES | NOTECHAR)+ NEWLINE;
k: 'K:C' NEWLINE;

REST: 'z';
DIV: '/';
NOTECHAR: [a-gA-G];
TUPLETSIGN: '(2' | '(3' | '(4';
NUMBER: DIGIT+;
DIGIT: [0-9];
LETTER: [a-zA-Z];
CHAR: [\.\-];

body: voice (voice)* NEWLINE?;
voice: v? segment+;
element: SPACES? (rest | note | chord | tuplet) SPACES;
segment : element+ BAR;

rest: REST length?;
note: (ACCIDENTAL)? NOTECHAR (OCTAVE)? length?;
chord: '[' note+ ']';
tuplet: TUPLETSIGN note+;
length: NUMBER | (NUMBER? DIV NUMBER?);

BAR: ((('|' | ':|' | '|:') ('[1' | '[2')?) | ('||' | '[|' | '|]')) NEWLINE?;
OCTAVE: ','+ | '\''+;

SPACES: [ ]+;
NEWLINE: '\r'? '\n';

