import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///Users/swpaul/Documents/Selenium%20Tutorial/Selenium/demoListBox.html");

		WebElement listbox1 = driver.findElement(By.id("”slv”"));
		WebElement listbox2 = driver.findElement(By.id("”mtr”"));

		Select select2 = new Select(listbox2);
		List<WebElement> options2 = select2.getOptions();

		for (WebElement option : options2) {
			System.out.println(option.getText());
		}

		select2.selectByIndex(0);
		select2.selectByValue("”c”");
		select2.selectByVisibleText("vada");

		Thread.sleep(2000);

		System.out.println(select2.getFirstSelectedOption().getText());
		options2.clear();
		options2 = select2.getAllSelectedOptions();
		for (WebElement option : options2) {
			System.out.println(option.getText());
		}

		Thread.sleep(2000);

		select2.deselectAll();

		Select select1 = new Select(listbox1);
		select1.selectByIndex(0);

		Thread.sleep(1000);

		select1.selectByIndex(2);

		Thread.sleep(2000);

		driver.quit();
	
	
	

	
	
	
	
	}
	
	
	
	
	
	

}
