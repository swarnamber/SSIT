import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindNumberOfLinksInAPage {

	public static void main(String[] args) {
	
//		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		List<WebElement> links = driver.findElements(By.tagName("img"));
		System.out.println(links.size());

		for (WebElement link:links) {
			
			System.out.println(link.getText());
		}
		
		driver.close();
	}

}
