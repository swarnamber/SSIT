import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Immp_HandlingWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/webtables");

		// find search box and pass value 12000
		driver.findElement(By.xpath("//input[@id=\"searchBox\"]")).sendKeys("12000");

		// finding 1st and last name from the table

		String rowXpath = "//div[@role='row']";
		System.out.println(driver.findElements(By.xpath(rowXpath)).size());

		List<WebElement> rows = driver.findElements(By.xpath("//div[@class=\"rt-td\"][1]|//div[@class=\"rt-td\"][2]"));

//		for (int i = 0; i < 4; i = +2) {  
//			for (int j = i; j < i + 2; j++) { 
//				System.out.print(rows.get(j).getText() + " ");
//			}
//			System.out.println();
//			
//		}
	}

	
	
}
