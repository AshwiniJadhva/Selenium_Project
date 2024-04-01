package com.basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*1. Launch chrome browser
2. Open automationbykrishna.com
3. Click on registration link
4. Enter username
5. Enter password
6. Click on submit button
7. Verify alert message
*/
public class OperationsOnFieldsTest {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\ashwiniProjects\\chrome exe\\chromedriver-win64\\chromedriver.exe");
		
		System.out.println("Launch chrome browser");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Step - Open automationbykrishna.com");
		String url = "http://automationbykrishna.com/";
		driver.get(url);
		
		System.out.println("Step - click on registration link");
		driver.findElement(By.id("registration2")).click();
		
		Thread.sleep(3000);
		
		System.out.println("Step - enter username");
		driver.findElement(By.id("unameSignin")).sendKeys("ashwini jadhav");
		
		System.out.println("Step - enter password");
		driver.findElement(By.id("pwdSignin")).sendKeys("12345");
		
		System.out.println("Step -  click on submit button");
		driver.findElement(By.id("btnsubmitdetails")).click();
		
		System.out.println("Step - verify alert message ");
		
		Alert alert = driver.switchTo().alert();
		String actualAlertMsg = "Failed! please enter strong password";
		String alertmsg = alert.getText();
		
		if(actualAlertMsg.equals(alertmsg))
			System.out.println("test pass");
		else System.out.println("test fail");
		System.out.println("alert msg is : "+alertmsg);
		alert.accept();
		JavascriptExecutor je = (JavascriptExecutor)driver;
		je.executeScript("scroll,(300)");
		driver.close();
	}

}
