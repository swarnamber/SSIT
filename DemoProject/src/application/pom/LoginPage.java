package application.pom;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.apache.poi.hssf.record.SupBookRecord;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.netty.handler.timeout.TimeoutException;

public class LoginPage {

	@FindBy(id = "firstName")
	private WebElement firstName;

	@FindBy(id = "lastName")
	private WebElement lastName;

	@FindBy(id = "userEmail")
	private WebElement userEmail;

	@FindBy(xpath = "//label[.=\"Male\"]")
	private WebElement genderM;

	@FindBy(xpath = "//label[.=\"Female\"]")
	private WebElement genderF;

	@FindBy(xpath = "//label[.=\"Other\"]")
	private WebElement genderO;

	@FindBy(id = "userNumber")
	private WebElement userNumber;

	@FindBy(id = "dateOfBirthInput")
	private WebElement dateOfBirthInput;

	@FindBy(xpath = "//input[@type='checkbox']/following-sibling::label[@class=\"custom-control-label\"]")
	private List<WebElement> hobbies;

	@FindBy(xpath = "//input[@id=\"subjectsInput\"]")
	private WebElement subject;

	@FindBy(xpath = "//div[@tabindex=\"-1\"]")
	private List<WebElement> subjectAS;

	@FindBy(xpath = "//button[@id=\"submit\"]")
	private WebElement submit;

	@FindBy(id = "currentAddress")
	private WebElement address;

	@FindBy(xpath = "(//div[@class=' css-1hwfws3'])[1]")
	private WebElement selectState;

	@FindBy(xpath = "//div[@tabindex=\"-1\"]")
	private List<WebElement> stateOptions;

	@FindBy(xpath = "(//div[@class=' css-1hwfws3'])[2]")
	private WebElement selectCity;

	@FindBy(xpath = "//div[@tabindex=\"-1\"]")
	private List<WebElement> cityOptions;

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	private void selectState(String inputState, WebDriver driver) {
		try {
			selectState.click();

			for (WebElement state : stateOptions) {
				if (state.getText().equalsIgnoreCase(inputState) || state.getText().contains(inputState))
					state.click();
			}
		} catch (Exception e) {
			//
		}
	}

	private void selectCity(String inputCity) {
		try {
			selectCity.click();
			for (WebElement city : cityOptions) {
				if (city.getText().equalsIgnoreCase(inputCity) || city.getText().contains(inputCity))
					city.click();
			}
		} catch (Exception e) {

		}
	}

	private void selectSex(String gender) {
		if (gender.equals("M"))
			genderM.click();
		else if (gender.equals("F"))
			genderF.click();
		else
			genderO.click();
	}

	private void selectSubjectFromAS(String sub, WebDriver driver) throws WebDriverException, IOException {
		subject.sendKeys(sub);
		if (subjectAS.size() > 0) {
			for (WebElement subject : subjectAS) {
				if (subject.getText().contains(sub) || subject.getText().equalsIgnoreCase(sub)) {
					System.out.println("Subject Selected - " + subject.getText());
					subject.click();
				}
			}
		} else {
			System.out.println("Enter Valid subject ... ");
			FileUtils.copyFile(((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE),
					new File("/Users/swpaul/Desktop/OBP/SSS1.PNG"));
		}
	}

	private void selectHobbies(List<String> userHobbies) {

		for (WebElement hobby : hobbies) {
			for (String userHobby : userHobbies) {
				if (hobby.getText().contains(userHobby) || hobby.getText().equalsIgnoreCase(userHobby))
					hobby.click();
			}
		}
	}

	public void fillTheForm(WebDriver driver, String FN, String LN, String email, String gender, String mobile,
			String subjectToBeSelected, List<String> userHobbies, String userAddress, String userState, String userCity)
			throws Exception {

		driver.navigate().refresh();
		
		firstName.sendKeys(FN);

		lastName.sendKeys(LN);

		userEmail.sendKeys(email);

		selectSex(gender);

		userNumber.sendKeys(mobile);

		selectSubjectFromAS(subjectToBeSelected, driver);

		selectHobbies(userHobbies);

		address.sendKeys(userAddress);

		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,300)");

		selectState(userState, driver);

		selectCity(userCity);

		submit.click();

		// submit.sendKeys(Keys.ENTER);
	}

}
