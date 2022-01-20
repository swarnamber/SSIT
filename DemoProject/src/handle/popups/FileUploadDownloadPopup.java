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

public class FileUploadDownloadPopup {

	public static void main(String[] args) throws InterruptedException, AWTException {
		FirefoxProfile fp =new FirefoxProfile();
		fp.setPreference("browser.download.folderList", 1);
		fp.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setProfile(fp);

		//WebDriver driver = new FirefoxDriver(firefoxOptions);

		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/upload-download");
		WebElement upload = driver.findElement(By.xpath("//input[@id=\"uploadFile\"]"));
		upload.sendKeys("/Users/swpaul/Desktop/OBP/xxzz1.PNG");
		
		WebElement download = driver.findElement(By.xpath("//a[@id='downloadButton']"));   //a[.='4.1.1']
		download.click();

//		driver.get("https://www.selenium.dev/downloads/");
//		WebElement download2 = driver.findElement(By.xpath("//a[.='4.1.1']"));
//
//		download2.click();
		
//		Robot robot = new Robot();

//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyPress(KeyEvent.VK_TAB);

//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_TAB);
//
//		robot.delay(500);
//		robot.keyPress(KeyEvent.VK_META);
//
//		robot.keyPress(KeyEvent.VK_SHIFT);
//
//		robot.keyPress(KeyEvent.VK_G);
//
//		robot.keyRelease(KeyEvent.VK_META);
//
//		robot.keyRelease(KeyEvent.VK_SHIFT);
//
//		robot.keyRelease(KeyEvent.VK_G);
//
//		// Paste the clipboard value
//
//		robot.keyPress(KeyEvent.VK_META);
//
//		robot.keyPress(KeyEvent.VK_V);
//
//		robot.keyRelease(KeyEvent.VK_META);
//
//		robot.keyRelease(KeyEvent.VK_V);
//
//		// Press Enter key to close the Goto window and Upload window
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//
//		robot.keyRelease(KeyEvent.VK_ENTER);
//
//		robot.delay(500);
//
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);

	}
}
