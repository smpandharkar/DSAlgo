package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DSStack {
	WebDriver driver = null;
	
	By OpsInStackLink = By.linkText("Operations in Stack");
	By ImplementLink = By.linkText("Implementation");
	By AppLink = By.linkText("Applications");
	By TryHere_link = By.linkText("Try here>>>");
	By Run_Button = By.tagName("button");
	By EnterCode_Textarea = By.xpath("//textarea[@autocorrect='off']");
	
	
	public DSStack(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void Click_OpsInStack() {
		driver.findElement(OpsInStackLink).click();
	}
	
	public void Click_ImplementLink() {
		driver.findElement(ImplementLink).click();
	}
	
	public void Click_AppLink() {
		driver.findElement(AppLink).click();
	}
	
	public void Click_TryHereLink() {
		driver.findElement(TryHere_link).click();
	}
	
	public void Click_RunButton() {
		driver.findElement(Run_Button).click();
	}
	
	public void Enter_PythonCode(String code) {
		driver.findElement(EnterCode_Textarea).sendKeys(code);
	}

}

