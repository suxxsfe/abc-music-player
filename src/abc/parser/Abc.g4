/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

//root: head body EOF;
root: segment EOF;

head: X T (C | L | M | Q | V)* K;
X: 'X:' INDEX NEWLINE;
T: 'T:' STRING NEWLINE;
C: 'C:' STRING NEWLINE;
L: 'L:' NUMBER '/' NUMBER NEWLINE;
M: 'M:' NUMBER '/' NUMBER NEWLINE;
Q: 'Q:' NUMBER '/' NUMBER '=' NUMBER NEWLINE;
V: 'V:' STRING NEWLINE;
K: 'K:C' NEWLINE;

body: (voice NEWLINE)+;
voice: (V)? (section SECTIONBAR)+ NEWLINE;
section: segment (BAR segment)*;
segment : NOTECHAR (SPACES NOTECHAR)*;
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
NOTECHAR: [a-zA-Z]+;
OCTAVE: '_'+ | '\''+;

STRING: [a-zA-Z,\-_ ]+;
NUMBER: [1-9][0-9]*;
INDEX: [0-9]+;

SPACES: [ ]+;
NEWLINE: '\r'? '\n';

