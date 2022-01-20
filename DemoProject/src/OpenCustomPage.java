import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenCustomPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/swpaul/Documents/Selenium%20Tutorial/Selenium/demo1.html");
		
		WebElement e = driver.findElement(By.cssSelector("a[id='a1']"));
//		e.click();
		
		System.out.println(e.getText());

	}

}
