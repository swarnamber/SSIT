package handle.popups;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class ChildBrowserPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://secure.indeed.com/auth?hl=en");
		driver.findElement(By.xpath("//input[@name=\"__email\"]")).sendKeys("aa");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		WebElement google = driver.findElement(By.xpath("//div[@id=\"googleContainer\"]"));
		WebElement apple = driver.findElement(By.xpath("//div[@id=\"googleContainer\"]/following-sibling::div[1]"));

		google.click();
//		apple.click();
		Set<String> s = driver.getWindowHandles(); // 1 2 3
		System.out.println(s.size());
		for (String wh : s) {
			System.out.println(driver.switchTo().window(wh).getTitle());
		}
		driver.findElement(By.xpath("//input[@id=\"identifierId\"]")).sendKeys("cvdsvse");

	}
}
