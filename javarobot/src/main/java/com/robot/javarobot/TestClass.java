package com.robot.javarobot;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.thoughtworks.selenium.webdriven.commands.KeyEvent;

/**
 *
 * @author Sanjeev Chaudhary https://github.com/sanjeevss3/
 *
 */

public class TestClass {
	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./drivers/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://naukari.com");
		
		driver.findElement(By.id("login_click")).click();
		
		driver.findElement(By.id("signin_email")).sendKeys("sanjeev.chaudhary@naukari.com");
		driver.findElement(By.id("signin_password")).sendKeys("test123");
		
		driver.findElement(By.name("signin_button")).click();
		
		driver.findElement(By.className("secondaryMenuItem hide-for-small-only")).click();
		
		
		//put path to your image in a clipboard
	//	StringSelection ss = new StringSelection(file.getAbsoluteFile());
	//	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);

		//imitate mouse events like ENTER, CTRL+C, CTRL+V
//		Robot robot = new Robot();
//		robot.delay(250);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.keyPress(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_V);
//		robot.keyRelease(KeyEvent.VK_CONTROL);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		robot.delay(50);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		
		
		
		
	}

}
