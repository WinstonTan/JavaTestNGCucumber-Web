# JavaTestNGCucumber-Web

Introduction:
This is a Maven test automation project written in java, integrated with Cucumber BDD, JUnit4, TestNG, Selenium and Apache POI plugins 
<br><br>

<ins>IDE and Runtime Setup Guide</ins>
1. Install Java (Project composed in JDK version 22.0.2)
2. Install Apache Maven (Project composed in version 3.8.1)
3. Install IntelliJ IDEA (Project composed in version 2024.2.0.1 Community Edition)

To run test, simply run the below command in project parent directory:
<br>
 >mvn clean install test -DcucumberOptions.tags="@\<Tag name assigned for feature scenario\>" 
<br><br>

Example:

 >mvn clean install test -DcucumberOptions.tags="@Register" 

 <br><br>

 After test completely executed, Cucumber test report can be obtained under "target" folder which configured in TestRunner.java file, 
> @CucumberOptions( plugin = {"pretty", "html:target/cucumber-report.html"})
