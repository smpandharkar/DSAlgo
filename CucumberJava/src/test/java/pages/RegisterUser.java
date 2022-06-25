package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterUser {
	WebDriver driver = null;
	By Username_Textbox = By.name("username");
	By Password_Textbox = By.name("password1");
	By Reenetr_Password = By.name("password2");
	By Register_Button = By.xpath("//input[@type='submit']");
	
	
	public RegisterUser(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Register_User(String name, String password) {
		driver.findElement(Username_Textbox).sendKeys(name);
		driver.findElement(Password_Textbox).sendKeys(password);
		driver.findElement(Reenetr_Password).sendKeys(password);
		driver.findElement(Register_Button).click();
	}

}
