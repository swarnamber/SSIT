package application.test;

import org.testng.annotations.Test;

import application.pom.LoginPage;
import net.bytebuddy.build.Plugin.Factory.UsingReflection.Priority;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class DemoTestNg {

	@BeforeSuite
	public void beforeSuit1() {
		Reporter.log("beforeSuit1 ... ", true);
	}

	@BeforeClass
	public void beforeClass() {
		Reporter.log("beforeClass ... ", true);
	}

	@AfterClass
	public void afterClass() {
		Reporter.log("afterClass ... ", true);
	}

	@BeforeTest
	public void beforeTest() {
		Reporter.log("beforeTest ... ", true);
	}

	@AfterTest
	public void afterTest() {
		Reporter.log("afterTest ... ", true);
	}

	@AfterSuite
	public void afterSuite() {
		Reporter.log("afterSuite ... ", true);
	}

	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("BeforeMethod ... ", true);
	}

	@AfterMethod
	public void afterMethod() {
		Reporter.log("AfterMethod ... ", true);
	}

	@Test(dependsOnMethods = "test1")
	public void test2() {
		Reporter.log("Test2 ... ", true);
	}

	@Test
	public void test1() {
		Reporter.log("Test1 ... ", true);
	}

	@Test(priority = 1)
	public void test3() {
		Reporter.log("Test1 ... ", true);
	}

	@Test(priority = 2)
	public void test3(String s) {
		Reporter.log("Test1 ... ", true);
	}

}
