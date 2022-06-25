package TestDSAlgo;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DSAlgoHomepage;
import pages.DSArray;
import pages.DSStack;
import pages.LandPageObjects;
import pages.SignInPage;

public class TestDataStructure extends BaseClass2{
	
	
	
	@Test (priority=1)
	public void DSArray_Test1() throws IOException, InterruptedException {
		
		driver.get(baseURL);
		driver.manage().window().maximize();
	    LandPageObjects Obj = new LandPageObjects(driver);
    	Obj.Click_GetStarted();
		DSAlgoHomepage HomeObj = new DSAlgoHomepage(driver);
		HomeObj.Click_DSArrayLink();
		DSArray Dobj = new DSArray(driver);
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Array";
// Check if user is on Array page
    	if (actualTitle == expectedTitle){
    		System.out.println("User is on Array page");
    		
    	}
// Login and click Array to go to Array page    	
    	else {
		
    	System.out.println("Please log in to continue");
    	HomeObj.Click_SignIn();
        String path = "C:\\Users\\swati\\eclipse-workspace\\CucumberJava\\src\\datafiles\\InputTestData.xlsx";
    	
    	XLSUtility xlutil = new XLSUtility(path);
    	String username = xlutil.getCellData("Sheet1", 1, 0);
    	String pwd = xlutil.getCellData("Sheet1", 1, 1);
    	
    	SignInPage SignObj  = new SignInPage(driver);
    	SignObj.SignIn_User(username, pwd);
    	HomeObj.Click_DSArrayLink();
    	}
    	
    	String[] ArrayLinks = {"Arrays in Python", "Arrays Using List", "Basic Operations in Lists", "Applications of Array"};
    	//System.out.println("Array Size: "+ArrayLinks.length);
    	System.out.println("Links on Array page: " + Arrays.toString(ArrayLinks));
    	
    	
    	for (int i=0;i<ArrayLinks.length;i++) {
    		if (ArrayLinks[i] == "Arrays in Python") {
    			Dobj.Click_ArrayPythonLink();
    		}
    		else if (ArrayLinks[i] == "Arrays Using List") {
    			Dobj.Click_ArrayListLink();
    		}
    		else if (ArrayLinks[i] == "Basic Operations in Lists") {
    			Dobj.Click_BasicOpsList();
    		
    		}
    		else if (ArrayLinks[i] == "Applications of Array") {
    			Dobj.Click_ArrayAppLink();
    		
    		}
    		
    	    System.out.println("Title of the page is " +driver.getTitle());
    	
    		Dobj.Click_TryHereLink();
        	Thread.sleep(1000);
        	
        	String pythonCode = "print 10";
        	Dobj.Enter_PythonCode(pythonCode);
        	System.out.println("Python code: " + pythonCode);
        	
        	Dobj.Click_RunButton();
        	
        	System.out.println("Output is: " +driver.findElement(By.xpath("//pre[@id='output']")).getText());
    	    driver.navigate().back();
    	    driver.navigate().back();
    	    
    	    
    	}
    	
    	driver.navigate().back();
    	//System.out.println(driver.getTitle());
    	}
    
	@Test (priority=2)
	public void DSStack_Test2() throws InterruptedException {
		DSAlgoHomepage HomeObj = new DSAlgoHomepage(driver);
		HomeObj.Click_StackLink();
		DSStack Dobj = new DSStack(driver);
		
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		String expectedTitle = "Stack";
		Assert.assertEquals(actualTitle, expectedTitle);
		String[] ArrayLinks = {"Operations in Stack", "Implementation", "Applications"};
    	//System.out.println("Array Size: "+ArrayLinks.length);
    	System.out.println("Links on Stack page: " + Arrays.toString(ArrayLinks));
    	
    	
    	for (int i=0;i<ArrayLinks.length;i++) {
    		if (ArrayLinks[i] == "Operations in Stack") {
    			Dobj.Click_OpsInStack();
    		}
    		else if (ArrayLinks[i] == "Implementation") {
    			Dobj.Click_ImplementLink();
    		}
    		else if (ArrayLinks[i] == "Applications") {
    			Dobj.Click_AppLink();
    		
    		}
    		
    		
    	    System.out.println("Title of the page is " +driver.getTitle());
    	
    		Dobj.Click_TryHereLink();
        	Thread.sleep(1000);
        	
        	String pythonCode = "print 20";
        	Dobj.Enter_PythonCode(pythonCode);
        	System.out.println("Python code: " + pythonCode);
        	
        	Dobj.Click_RunButton();
        	
        	System.out.println("Output is: " +driver.findElement(By.xpath("//pre[@id='output']")).getText());
        	driver.navigate().back();
    	    driver.navigate().back();

	}
    	
	}}
