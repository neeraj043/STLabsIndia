package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Courses {

	By CourseLink=By.xpath("//li//a[contains(text(), 'Courses')]");
	
	WebDriver driver;
	
	public Courses(WebDriver driver) {
		this.driver=driver;
	}
	
	public void clickCoursesLink() {
		driver.findElement(CourseLink).click();
	}
	
}
