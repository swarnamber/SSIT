import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GetMobilePriceFlipKart {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String url = "https://www.flipkart.com/mobiles/~cs-hgiutrmgzd/pr?sid=tyy%2C4io&collection-tab-name=Realme%208s%205G&param=374&otracker=clp_banner_2_20.bannerX3.BANNER_mobile-phones-store_OMU4AGF3F12H&fm=neo%2Fmerchandising&iid=M_299c98c9-67c3-4893-baa4-82cb5652195a_20.OMU4AGF3F12H&ppt=browse&ppn=browse&ssid=wym5e7d7hc0000001641483186787";
		String xp = "//li[contains(.,'8 GB RAM')]/../../preceding-sibling::div[.='realme 8s 5G (Universe Purple, 128 GB)']/../following-sibling::div//div[@class=\"_30jeq3 _1_WHN1\"]\n"
				+ "";
		WebDriver driver = new ChromeDriver();

//		driver.get(url);

		driver.navigate().to(url);
		Thread.sleep(2000);

		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();

//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//		WebDriverWait wait = new WebDriverWait(driver, 10);

//		WebDriverWait wait = new WebDriverWait(driver,Duratsion.ofSeconds(10));

		// wait.until(ExpectedConditions.titleContains("Flipkartr")); // predicate
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xp))); // predicate
//
//		driver.findElement(By.xpath(xp)).click();

//		e.click();
		// System.out.println(e.getText());

	}

}
