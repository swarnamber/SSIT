import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoXpathID {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/swpaul/Documents/Selenium%20Tutorial/Selenium/demoID.html");

		WebElement e = driver.findElement(By.xpath("//td[.='Selenium']/../td[.='3']/following-sibling::td[1]"));
	
		System.out.println(e.getText());
		Thread.sleep(3000);
		driver.close();
		

	}

}


//li[.='8 GB RAM | 128 GB ROM | Expandable Upto 1 TB']/../../preceding-sibling::div[.='realme 8s 5G (Universe Purple, 128 GB)']/../following-sibling::div//div[@class="_30jeq3 _1_WHN1"]





//div[@class='_30jeq3 _1_WHN1']/../../../preceding-sibling::div[@class="col col-7-12"]/div[@class="fMghEO"]/descendant::li[.='8 GB RAM | 128 GB ROM | Expandable Upto 1 TB']