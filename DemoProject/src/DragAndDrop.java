import java.time.Duration;
import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.navigate().to("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/");
		WebElement b1 = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement b3 = driver.findElement(By.xpath("//h1[.='Block 3']"));
		WebElement b4 = driver.findElement(By.xpath("//h1[.='Block 4']"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		Actions a = new Actions(driver);
		a.dragAndDrop(b1, b3).perform();
		// wait.until(ExpectedConditions.(By.xpath("//h1[.='Block 4']")));
		Thread.sleep(1000);
		a.dragAndDrop(b4, b1).perform();
	
	}

}
