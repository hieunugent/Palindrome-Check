JC= javac
JA= java
SC =source

default: junit clean compile run
junit:
	$(SC) ~./bash_profile
clean:
	rm *.class
compile:
	$(JC) *.java
run:
	$(JA) TestRunner
