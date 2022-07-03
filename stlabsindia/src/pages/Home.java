package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	
	By STLink=By.xpath("//div//li[contains(text(), 'Software Testing Course')]");
	By JavaLink=By.xpath("Java/J2EE Course");
	
	WebDriver driver;
	
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickSTLink(WebDriver driver) {
		driver.findElement(STLink).click();
		driver.findElement(JavaLink).click();
	}
}
