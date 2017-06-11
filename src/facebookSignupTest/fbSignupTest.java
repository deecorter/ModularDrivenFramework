package facebookSignupTest;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class fbSignupTest {
	
	WebDriver driver=null;

	
	@BeforeSuite
	public void beforesuite(){
		System.out.println("Test Suite Ended");
	}
	
	@AfterSuite
	public void aftersuite(){
		System.out.println("Test Suite Ended");
	}
	
	@BeforeTest
	public void beforetest(){
		System.out.println("Start the browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Jar File\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}
	
	@AfterTest
	public void aftertest(){
		System.out.println("Browser will close now");
		driver.close();
	}
	
	@BeforeMethod
	public void beforeMethod(){
		System.out.println("before each test");
	}
	
	@AfterMethod
	public void afterMethod(){
		System.out.println("after each test");
	}
	
	
}
