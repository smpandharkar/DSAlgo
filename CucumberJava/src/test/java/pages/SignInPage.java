package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
	WebDriver driver = null;
	By Username_Textbox = By.name("username");
	By Password_Textbox = By.name("password");
	
	By Login_Button = By.xpath("//input[@type='submit']");
	
	
	public SignInPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void SignIn_User(String name, String password) {
		driver.findElement(Username_Textbox).sendKeys(name);
		driver.findElement(Password_Textbox).sendKeys(password);
		
		driver.findElement(Login_Button).click();
	}

}
