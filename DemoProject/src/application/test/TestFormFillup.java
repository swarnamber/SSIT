package application.test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import application.pom.LoginPage;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbookFactory;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestFormFillup {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("https://demoqa.com/automation-practice-form");
		LoginPage l = new LoginPage(driver);

		List<String> hobbies = new ArrayList<>();
		hobbies.add("Read");
		hobbies.add("Spo");

		l.fillTheForm(driver, "Swarnamber", "Paul", "workdata200@gmail.com", "X", "9876543210", "Bio", hobbies,
				"USA, Manhattan, New York", "NC", "Del");

	}
}
