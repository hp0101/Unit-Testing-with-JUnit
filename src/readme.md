<<<<<<< HEAD
1. Compile all Java files and save to "out" folder using libraries from the classpath link provided <br>
javac -d out -cp .:"/Users/hungphan/.p2/pool/plugins/*" HungPhan.java TestHungPhan.java <br>
or <br>
Download org.junit.jupiter.api_5.5.1.v20190826-0900.jar and run the command below <br>
javac -d out -cp org.junit.jupiter.api_5.5.1.v20190826-0900.jar:. HungPhan.java TestHungPhan.java (Ignore the warning)
<br>
2. Download junit-platform-console-standalone-1.5.2.jar and run the command below to execute JUnit 5 Test.
=======
1. Compile all Java files and save to "out" folder using libraries from the classpath link provided<br>
javac -d out -cp .:"/Users/hungphan/.p2/pool/plugins/*" HungPhan.java TestHungPhan.java

2. Download junit-platform-console-standalone-1.5.2.jar and run the command below to execute JUnit 5 Test.<br>
>>>>>>> d93c43a67bde89eaa6d273d80852eaa853d7c0af
java -jar junit-platform-console-standalone-1.5.2.jar --class-path out --scan-class-path
