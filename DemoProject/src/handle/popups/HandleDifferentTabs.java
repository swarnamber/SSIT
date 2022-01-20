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

public class HandleDifferentTabs {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/links");
		driver.findElement(By.id("dynamicLink")).click();
		driver.findElement(By.id("dynamicLink")).click();
		Set<String> whs = driver.getWindowHandles(); // 1 2 3
		System.out.println("Total number of new tabs.. " + (whs.size() - 1));
		for (String wh : whs) {
			if (driver.switchTo().window(wh).getCurrentUrl().equalsIgnoreCase("https://demoqa.com/")) {
				System.out.println("This is the new Tab --  " + driver.switchTo().window(wh).getTitle());
			}
		}
	}
}
