import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleWebTable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/swpaul/Documents/Selenium%20Tutorial/Selenium/WebTable.html");

		// print the content of table 1

//		List<WebElement> table1 = driver.findElements(By.xpath("//table[@id='t1']//td"));

		WebElement table1 = driver.findElement(By.id("t1"));
		List<WebElement> allTD = table1.findElements(By.tagName("td"));

		for (WebElement td : allTD) {
			System.out.println(td.getText());
		}

		
		
		
		// print the content of table 2

		WebElement table2 = driver.findElement(By.id("t2"));
		List<WebElement> allTDs = table2.findElements(By.tagName("td"));

		for (WebElement td : allTDs) {
			System.out.println(td.getText());
		}

		// find only the number from table 1
		System.out.println();
		System.out.println();
		for (WebElement td : allTD) {

			try {
				int i = Integer.parseInt(td.getText());  // 1 "1"  "A"
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		// find only the number from table 2
		System.out.println();
		System.out.println();

		for (WebElement td : allTDs) {

			try {
				int i = Integer.parseInt(td.getText());
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
		}

		driver.quit();

	}

}
