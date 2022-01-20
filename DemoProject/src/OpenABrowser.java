import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenABrowser {

	/*
	 * 1. Verify the UN text box is visible ? 2. Verify the login button is visible
	 * ? 3. Verify the Password is visible? 4. Verify the login using valid UN and
	 * pwd? 5. Verify the Login with valid UN and invalid pwd .Verify the error msg
	 */

	public static void main(String[] args) throws Exception {
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.saucedemo.com/");
//		WebElement un = driver.findElement(By.xpath("//input[@id='user-name']"));
//
////		WebElement un = driver.findElement(By.tagName("input"));
////		System.out.println(un.isDisplayed());
//		WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
//
//		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
////		System.out.println(login.isDisplayed());
//
//		un.sendKeys("standard_user");
//		pwd.sendKeys("secret_sauce");
//		login.click();
//
//		//Thread.sleep(3000);
//		
//		driver.close();
//		
//		//Tag@AN=’AV’]
		
		//Tag[text()=’text value’]
		
		//Tag[contains(text(),’textvalue’)]  
		
		//Tag[contains(@attribute name ,’attribute value’)]
		
		//span[@class='laptop-desktop-only']
		
		
		
		
		
		
		
		
		
//		System.out.println(driver.findElement(By.cssSelector("h3[data-test='error']")).getText());

		//

		// input/div

//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		// driver.navigate().to("https://www.selenium.dev/downloads/");
		// System.out.println(driver.getPageSource());

//		driver.findElement(By.id("user-name")).sendKeys("standard_user");
//		driver.findElement(By.name("password")).sendKeys("secret_sauce");
//		driver.findElement(By.xpath("//*[@id=\"login-button\"]")).click();

		// driver.quit();

	}
}
