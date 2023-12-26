main: parser sound
	javac -classpath "$CLASSPATH:./src:./lib/antlr.jar" src/abc/*.java

parser: antlr
	javac -classpath "$CLASSPATH:./src:./lib/antlr.jar" src/abc/parser/*.java

sound:
	javac -classpath "$CLASSPATH:./src" src/abc/sound/*.java

antlr: src/abc/parser/Abc.g4 src/abc/parser/Configuration.g4
	java -jar ./lib/antlr.jar src/abc/parser/Abc.g4

