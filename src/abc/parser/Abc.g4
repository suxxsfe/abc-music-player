/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: head body EOF;

head: x t (c | l | m | q | v)* k;

x: 'X:' SPACES? number NEWLINE;
t: 'T:' SPACES? string NEWLINE;
c: 'C:' SPACES? string NEWLINE;
l: 'L:' SPACES? number DIV number NEWLINE;
m: 'M:' SPACES? ((number DIV number) | string) NEWLINE;
q: 'Q:' SPACES? number DIV number ACCIDENTAL number NEWLINE;
v: 'V:' SPACES? string NEWLINE;
k: 'K:' SPACES? string NEWLINE;

body: voice (voice)* NEWLINE?;
voice: v? segment+;
element: SPACES? (rest | note | chord | tuplet) SPACES?;
segment: BAR? element+ BAR;

rest: REST length?;
note: (ACCIDENTAL)? NOTECHAR (OCTAVE)? length?;
chord: '[' note+ ']';
tuplet: TUPLETSIGN note+;
length: number | (number? DIV number?);

number: DIGIT+;
string: (ANY | BAR | OCTAVE | ACCIDENTAL | REST | DIV | NOTECHAR | TUPLETSIGN | DIGIT | SPACES)+;

SPACES: [ ]+;
NEWLINE: SPACES? '\r'? '\n';

BAR: ((('|' | ':|' | '|:') ('[1' | '[2')?) | ('||' | '[|' | '|]')) NEWLINE?;
OCTAVE: ','+ | '\''+;
ACCIDENTAL: '^' | '^^' | '_' | '__' | '=';
REST: 'z';
DIV: '/';
NOTECHAR: [a-gA-G];
TUPLETSIGN: '(2' | '(3' | '(4';
DIGIT: [0-9];
ANY: ~[\r\n];
COMMENT: '%'  ~('\n' | '\r')* NEWLINE -> skip;

