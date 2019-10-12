1. Compile all Java files and save to "out" folder using libraries from the classpath link provided
javac -d out -cp .:"/Users/hungphan/.p2/pool/plugins/*" HungPhan.java TestHungPhan.java
<br>
2. Download junit-platform-console-standalone-1.5.2.jar and run the command below to execute JUnit 5 Test.
java -jar junit-platform-console-standalone-1.5.2.jar --class-path out --scan-class-path
