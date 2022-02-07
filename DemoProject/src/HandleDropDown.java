import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://istqb.in/#");
		String xp = "(//a[.='ABOUT US'])[1]";
		WebElement menu = driver.findElement(By.xpath(xp));
		
		Actions actions = new Actions(driver);
		// mouse hover on menu
		actions.moveToElement(menu).perform();
		// select sub menu
//		driver.findElement(By.linkText("BENEFITS")).click();
//		driver.close();
		
		
		
	}

}