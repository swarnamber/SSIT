import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAS {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("java");
		Thread.sleep(2000);

		List<WebElement> es = driver
				.findElements(By.xpath("//div[@class='UUbT9']/descendant::span[contains(.,'java')]"));
		System.out.println(es.size());
		for (WebElement e : es) {
			System.out.println(e.getText());
//			if (e.getText().equalsIgnoreCase("javatpoint"))
//				e.click();

		}

		Thread.sleep(2000);
		driver.close();

	}

}
