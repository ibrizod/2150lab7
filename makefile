default: src/cpsc2150/listDec/IShuffleList.java src/cpsc2150/listDec/ShuffleApp.java src/cpsc2150/listDec/ShuffleList.java
	javac src/cpsc2150/listDec/IShuffleList.java src/cpsc2150/listDec/ShuffleApp.java src/cpsc2150/listDec/ShuffleList.java

# target to run cpsc2150.listDec.ShuffleApp
run: src/cpsc2150/listDec/ShuffleApp.class src/cpsc2150/listDec/ShuffleList.class src/cpsc2150/listDec/IShuffleList.class
	java -cp src cpsc2150/listDec/ShuffleApp

# target to clean the directory by removing all .class files
clean:
	rm -f src/cpsc2150/listDec/*.class
