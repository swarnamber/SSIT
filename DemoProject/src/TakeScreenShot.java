import java.util.*;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;


public class TakeScreenShot {

	public static void main(String[] args) throws AWTException, IOException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(f,new File("/Users/swpaul/Desktop/OBP/xzz10.PNG"));
				
	}

}
