set projectLocation=C:\Users\swati\eclipse-workspace\CucumberJava
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause