import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.input.Input.DispatchKeyEventType;
import org.openqa.selenium.support.ui.Select;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class UsingRobotClass {
	

	public static void main(String[] args) throws  AWTException, IOException {
		Robot robot = new Robot();
//				ChromeDriver driver = new ChromeDriver();
//		driver.get("https://www.google.co.in/");
	
		
//		Runtime r=Runtime.getRuntime();
//		  r.exec("notepad.exe"); 
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
	}

}
	