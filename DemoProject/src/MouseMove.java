import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.Desktop.Action;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class MouseMove {

	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleIs("Google"));

//		JavascriptExecutor j = (JavascriptExecutor) driver;
//
//		for (int i = 10; i < 10000; i++) {
//			j.executeScript("window.moveBy(" + i + ",10 )");
//		}

		Actions action = new Actions(driver);
		for (int i = 1; i < 10; i++) {
action.moveToElement(driver.findElement(By.id("")), i, 10);
	//		action.moveByOffset(i, 10).perform();

		}
		driver.quit();
	}

}
