package testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {
	WebDriver driver;

	@Test
	public void enterUrl() {
		driver.get("https://www.google.co.in/");
		SoftAssert s = new SoftAssert();
		s.assertEquals(driver.getTitle(), "xx");
		driver.navigate().to("https://www.gmail.com/");
		
		
		
		s.assertAll();

	}

	@BeforeMethod
	public void beforeMethod() {
		driver = new ChromeDriver();

	}

	@AfterMethod
	public void afterMethod() {
		driver.close();
	}

}
