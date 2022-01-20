import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpathAxis {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/swpaul/Documents/Selenium%20Tutorial/Selenium/demoAxis.html");

		WebElement e = driver.findElement(By.xpath("//body/descendant::option[@value='”c”']"));
		e.click();

		System.out.println(e.getText());

		Thread.sleep(3000);
		driver.close();

	}

}
