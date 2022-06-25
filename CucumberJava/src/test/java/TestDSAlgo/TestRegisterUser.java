package TestDSAlgo;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.DSAlgoHomepage;
import pages.LandPageObjects;
import pages.RegisterUser;

public class TestRegisterUser extends BaseClass {
	
    
    @Test
    
        public void DSAlgoRegisterUser (){
        driver.get(baseURL);	
    	LandPageObjects LandObj = new LandPageObjects(driver);
    	LandObj.Click_GetStarted();
    	DSAlgoHomepage HomeObj = new DSAlgoHomepage(driver);
    	HomeObj.Click_RegisterLink();
    	RegisterUser UserObj = new RegisterUser(driver);
    	UserObj.Register_User(username, password);
    }
    
    }  
    
