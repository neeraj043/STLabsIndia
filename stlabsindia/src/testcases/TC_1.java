package testcases;
import pages.Home;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.Courses;

public class TC_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://stlabsindia.in");
		Thread.sleep(5000);
		
		Home Hm=new Home(driver);
		Courses Cours=new Courses(driver);
		
		Hm.clickSTLink(driver);
		Cours.clickCoursesLink();
		
		driver.quit();
		
	}

}
