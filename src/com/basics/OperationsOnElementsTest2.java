package com.basics;
/*
 * TC#2 - Second Box
- Enter email
- Enter password
- verify message "You successfully clicked on it"
 
 */

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basics.base.Prerequisites;

public class OperationsOnElementsTest2 {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Prerequisites.starts("http://automationbykrishna.com/");
	
		
		System.out.println("step 3. click on Basic elements link");
		driver.findElement(By.id("basicelements")).click();
		

		
		Thread.sleep(3000);
		System.out.println("Step 4. Enter email");
		driver.findElement(By.id("exampleInputEmail1")).sendKeys("ashwini@gmail.com");
		
		System.out.println("Step 5. Enter password");
		driver.findElement(By.id("pwd")).sendKeys("ash12345");
		
		
		
		System.out.println("Step 6. click submit.");
		driver.findElement(By.id("submitb2")).click();
		
		System.out.println("Step 7.verify message \"You successfully clicked on it");
		Alert alert = driver.switchTo().alert();
		String actualalertmsg = alert.getText();
		String expectedalertmsg = "You successfully clicked on it";
		if(expectedalertmsg.equals(actualalertmsg)) {
			System.out.println("alert msg is : "+actualalertmsg);
			System.out.println("Test Pass");
		}
		else {
			System.out.println("alert msg is : "+actualalertmsg);
			System.out.println("Test Fail");
		}
			
		
		alert.dismiss();
		driver.close();
		
		
	}

}
