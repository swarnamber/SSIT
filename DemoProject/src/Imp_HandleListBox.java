import java.time.Duration;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Imp_HandleListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		driver.manage().window().maximize();

		System.out.println("1st div dropdown");

		WebElement listbox = driver.findElement(By.xpath("//div[@id='selectOne']/div/div[1]"));
		listbox.click();

		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@tabindex='-1']"));
		for (WebElement option : options) {
			if (option.getText().contains("Prof")) {
				System.out.println(option.getText());
				option.click();
				break;
			}
		}
		
		System.out.println("2nd div dropdown");
		System.out.println();

		WebElement listbox2 = driver.findElement(By.xpath("(//div[@class=' css-1hwfws3'])[3]"));
		listbox2.click();

		Thread.sleep(2000);
		List<WebElement> options2 = driver.findElements(By.xpath("//div[@class=' css-11unzgr']//div[@tabindex='-1\']"));
		for (WebElement option : options2) {
			if (option.getText().contains("Blue") || option.getText().contains("Black")) {

				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
				wait.until(ExpectedConditions
						.elementToBeClickable(By.xpath("//div[@class=' css-11unzgr']//div[@tabindex='-1\']")));
				System.out.println(option.getText());

				
				JavascriptExecutor j = (JavascriptExecutor) driver;
				j.executeScript("arguments[0].click()", option);

			}
		}

//		driver.quit();
	}

}
