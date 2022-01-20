package handle.popups;

import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
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

public class HandleHiddenDivisionPopups {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		driver.get("https://demoqa.com/date-picker");

		driver.get("https://www.starhealth.in/customerportal/instant-renewal");
//		Thread.sleep(2000);

//		WebElement calender = driver.findElement(By.id("datePickerMonthYearInput"));
//		wait.until(ExpectedConditions.elementToBeClickable(calender));
//
//		calender.click();
//		Thread.sleep(2000);
//		calender.findElement(By.xpath("//div[@aria-label=\"Choose Monday, January 24th, 2022\"]")).click();
//
//		Thread.sleep(4000);
//
//		calender.click();
//		WebElement month = driver.findElement(By.xpath("//select[@class=\"react-datepicker__month-select\"]"));
//		WebElement year = driver.findElement(By.xpath("//select[@class=\"react-datepicker__year-select\"]"));
//
//		Select s1 = new Select(month);
//		Thread.sleep(2000);
//		s1.selectByVisibleText("May");
//		Thread.sleep(2000);
//		Select s2 = new Select(year);
//		Thread.sleep(2000);
//		s2.selectByVisibleText("2041");
//		Thread.sleep(2000);
//		calender.findElement(By.xpath("//div[@aria-label=\"Choose Wednesday, May 22nd, 2041\"]")).click();

//		WebElement calender = driver.findElement(By.xpath("//input[@placeholder=\"DD-MM-YYYY\"]"));
//
//		calender.sendKeys("14-02-2023");
//		Thread.sleep(2000);
//
//		calender.sendKeys(Keys.ENTER);
		
		//Dimension d=new Dimension();
	
		System.out.println(driver.manage().window().getSize());
		System.out.println(driver.manage().window().getPosition());

	}
}
