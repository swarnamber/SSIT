import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleCB {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demoqa.com/checkbox");

		driver.findElement(By.xpath("//button[@title=\"Expand all\"]")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@title=\"Collapse all\"]")).click();
//		Thread.sleep(2000);
		WebElement react = driver.findElement(By.xpath("//label[@for=\"tree-node-react\"]"));
		react.click();
		WebElement veu = driver.findElement(By.xpath("//label[@for=\"tree-node-veu\"]"));
		veu.click();

		// WebElement cb1=driver.findElement(By.xpath(null));

		WebElement cb2 = driver.findElement(By.xpath("(//span[@class='rct-checkbox']//*[local-name()='svg'])[9]"));
		System.out.println(cb2.getAttribute("class"));

		if (!cb2.getAttribute("class").contains("uncheck")) {    
			System.out.println("Selected ");

		} else
			System.out.println("Not Selected.. ");

		// if (react.isSelected()) {
//			System.out.println("CBs are selected");
//		} else {
//			System.out.println("Some thing is fishy   ... :( ");
//		}

	}

}
