package TestDSAlgo;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import com.google.common.base.Verify;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.DSAlgoHomepage;
import pages.LandPageObjects;
import pages.RegisterUser;
import pages.SignInPage;

public class TestSignInUser extends BaseClass2 {
	
    
    
    @Test(dataProvider = "LoginData")
    
    public void SignInUser_Test(String username, String pwd) {
    	
    	driver.get(baseURL);
    	//driver.manage().window().maximize();
    	LandPageObjects Obj = new LandPageObjects(driver);
    	Obj.Click_GetStarted();
    	DSAlgoHomepage HomeObj = new DSAlgoHomepage(driver);
    	HomeObj.Click_SignIn();
    	SignInPage SignObj  = new SignInPage(driver);
    	SignObj.SignIn_User(username, pwd);
    	String LoginStatus = driver.findElement(By.xpath("//div[@role='alert']")).getText();
    	
    	if (LoginStatus.contentEquals("You are logged in")) {
    		Assert.assertEquals(LoginStatus, "You are logged in");
    		HomeObj.Click_SignOut();
    		System.out.println("Login status of "+username + " is- " + LoginStatus);
    	}
    	else {
    		System.out.println("Login status of "+username+ " is- "+LoginStatus);
    		Assert.assertEquals(LoginStatus, "You are logged in");
    	}
    }
    	//System.out.println(username + pwd );
    	//System.out.println(LoginStatus);
    
    
    @DataProvider(name="LoginData")
    public String [][] getData() throws IOException {

    	
    	//Get the data from excel file
    	String path = "C:\\Users\\swati\\git\\DSAlgo\\CucumberJava\\src\\datafiles\\InputTestData.xlsx";
    	
    	XLSUtility xlutil = new XLSUtility(path);
    	int totalrows = xlutil.getRowCount("Sheet1");
    	int totalcols = xlutil.getCellCount("Sheet1", 1);
    	String loginData[][] = new String[totalrows][totalcols];
    	
    	for (int i=1; i<=totalrows;i++) //row 1
    	{
    		for(int j=0;j<totalcols;j++) // column 0
    		{
    			loginData[i-1][j] = xlutil.getCellData("Sheet1", i, j);
    		}
    	}
    	
    	return loginData;
    }}
