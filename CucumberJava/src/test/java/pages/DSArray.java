package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DSArray {
	WebDriver driver = null;
	By ArrayPython_link = By.linkText("Arrays in Python");
	By ArrayListLink = By.linkText("Arrays Using List");
	By BasicOpsList = By.linkText("Basic Operations in Lists");
	By ArrayApp = By.linkText("Applications of Array");
	By TryHere_link = By.linkText("Try here>>>");
	By Run_Button = By.tagName("button");
	By EnterCode_Textarea = By.xpath("//textarea[@autocorrect='off']");
	By Array_links = By.xpath("//a[contains(@class,'list-group-item')]");
	
	
	public DSArray(WebDriver driver) {
		this.driver = driver;
	}
	
	public void Click_ArrayPythonLink() {
		driver.findElement(ArrayPython_link).click();
	}
	
	public void Click_ArrayListLink() {
		driver.findElement(ArrayListLink).click();
	}
	
	public void Click_BasicOpsList() {
		driver.findElement(BasicOpsList).click();
	}
	
	public void Click_ArrayAppLink() {
		driver.findElement(ArrayApp).click();
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
	
	public void Array_links_loop() {
		List<WebElement> links = driver.findElements(Array_links);
		System.out.println(links.size());
		for(WebElement ele:links) {
			System.out.println(ele.getText());
		}
	}

}
