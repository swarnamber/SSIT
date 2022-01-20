import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class DemoStaleElementRefException {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		WebElement searchBox = driver.findElement(By.name("q"));

		Thread.sleep(2000);
		driver.navigate().refresh();

		searchBox.sendKeys("Java");

	}

}




