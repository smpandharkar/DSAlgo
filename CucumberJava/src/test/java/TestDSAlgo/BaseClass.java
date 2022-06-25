package TestDSAlgo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	String baseURL = "https://dsportalapp.herokuapp.com/";
	String username = "Lily";
	String password = "Userlily123";
	public static WebDriver driver;
	
	@BeforeSuite
	public void LaunchURL() {
		WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
	}
	
	@AfterSuite
	public void CloseWebpage() {
		
		driver.quit();
	}
    
	
	public void TakeFailedScreenshot(String testMethodName) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			
			FileUtils.copyFile(srcFile, new File("C:/Users/swati/eclipse-workspace/CucumberJava/Screenshots/"+
			testMethodName + ".jpg"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
