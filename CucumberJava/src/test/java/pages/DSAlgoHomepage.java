package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSAlgoHomepage {
	WebDriver driver = null;
	By Register_link = By.linkText("Register");
	By DSArray_Link = By.xpath("//div[contains(@class,'row-cols')]/div[2]//a");
	//By DSArray_Link = By.linkText("Array");
	By SignOut_link = By.linkText("Sign out");
	By SignIn_Link = By.linkText("Sign in");
	By Stack_Link = By.xpath("//div[contains(@class,'row-cols')]/div[4]//a");
	
	public DSAlgoHomepage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Click_RegisterLink() {
		driver.findElement(Register_link).click();
	}

	public void Click_DSArrayLink() {
		driver.findElement(DSArray_Link).click();
	}
	
	public void Click_StackLink() {
		driver.findElement(Stack_Link).click();
	}
	public void Click_SignIn() {
		driver.findElement(SignIn_Link).click();
	}
	public void Click_SignOut() {
		driver.findElement(SignOut_link).click();
	}
}



 	
