package TestDSAlgo;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass2 {
	String baseURL = "https://dsportalapp.herokuapp.com/";
	String username = "Lily";
	String password = "Userlily123";
	public static WebDriver driver;
	
	
	
	@BeforeTest
	@Parameters ("browser")
	public void LaunchURL(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	
    	driver.manage().window().maximize();
		}
		else if (browser.equalsIgnoreCase("Edge")) {
			WebDriverManager.edgedriver().setup();
	    	driver = new EdgeDriver();
	    	
	    	driver.manage().window().maximize();	
		}
		 
	}
	
	@AfterTest
	public void CloseWebpage() {
		
		driver.quit();
	}
    
	
	public void TakeFailedScreenshot(String testMethodName) {
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d = new Date();

		String FileName = d.toString().replace(":", "_").replace(" ", "_");
		try {
			
			FileUtils.copyFile(srcFile, new File("C:/Users/swati/eclipse-workspace/CucumberJava/Screenshots/"+
			testMethodName + "_" + FileName + ".png"));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
