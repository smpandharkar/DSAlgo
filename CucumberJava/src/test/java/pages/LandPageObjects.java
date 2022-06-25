package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandPageObjects {
	WebDriver driver = null;
	By GetStarted_button = By.className("btn");
	
	
	public LandPageObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Click_GetStarted() {
		driver.findElement(GetStarted_button).click();
	}

}
