package handle.popups;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class HandleAlertAndConfirmationPopups {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		
		JavascriptExecutor j = (JavascriptExecutor) driver;
		j.executeScript("alert('Hi')");
		
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@id=\"alertButton\"]")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@id=\"timerAlertButton\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);

		driver.switchTo().alert().accept();

		driver.findElement(By.xpath("//button[@id=\"confirmButton\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();

		driver.findElement(By.xpath("//button[@id=\"promtButton\"]")).click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("YeYUpp");
		driver.switchTo().alert().accept();

	}
}

// (//div[@class="RwLyCe"])[3]