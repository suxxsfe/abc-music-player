/*
 * Compile all your grammars using
 *       java -jar ../../../lib/antlr.jar *.g4
 * then Refresh in Eclipse.
 */
grammar Abc;
import Configuration;

root: head body EOF;

head: X T (C | L | M | Q | V)* K;
X: 'X:' INDEX;
T: 'T:' STRING;
C: 'C:' STRING;
L: 'L:' NUMBER '/' NUMBER;
M: 'M:' NUMBER '/' NUMBER;
Q: 'Q:' NUMBER '/' NUMBER '=' NUMBER;
V: 'V:' STRING;
K: 'K:' ;

body: voice+;
voice: V? (section SECTIONBAR)+;
section: (segment BAR?)+;
segment: element+;
element: rest | note | chord | tuplet;
rest: REST length?;
note: ACCIDENTAL? NOTE OCTAVE? length?;
chord: '[' note+ ']';
tuplet: '(' TUPLETLENGTH note+;
length: NUMBER? '/' NUMBER?;

SECTIONBAR: '||' | '[|' | '|]';
BAR: ('|' | ':|' | '|:') ('[1' | '[2')?;
REST: 'z';
TUPLETLENGTH: '2' | '3' | '4';
ACCIDENTAL: '^' | '^^' | '=' | '_' | '__';
NOTE: [a-gA-G];
OCTAVE: '_'+ | '\''+;

STRING: [0-9a-zA-Z.,-_ ]+;
NUMBER: [1-9][0-9]*;
INDEX: [0-9]+;

SPACES: [ ]+ -> skip;
TABS: [	]+ -> skip;

