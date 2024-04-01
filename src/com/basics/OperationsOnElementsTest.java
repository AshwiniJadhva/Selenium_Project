package com.basics;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
/*
 * Test - 3
 
TC#1 - First Box
- Enter Fname, Lname and Company name.
- click submit.
- you should get alert; get that text and verify.
 */
import org.openqa.selenium.WebDriver;

import com.basics.base.Prerequisites;

public class OperationsOnElementsTest {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = Prerequisites.starts("http://automationbykrishna.com/");
	
		
		System.out.println("step 3. click on Basic elements link");
		driver.findElement(By.id("basicelements")).click();
		

		
		Thread.sleep(3000);
		System.out.println("Step 4. Enter Fname");
		driver.findElement(By.id("UserFirstName")).sendKeys("ashwini Jadhav");
		
		System.out.println("Step 5. Enter Lname");
		driver.findElement(By.id("UserLastName")).sendKeys("ash12345");
		
		System.out.println("Step 6. Enter Company name");
		driver.findElement(By.id("UserCompanyName")).sendKeys("xoriant");
		
		System.out.println("Step 7. click submit.");
		driver.findElement(By.xpath("//button[@onclick= 'myFunctionPopUp()']")).click();
		
		Alert alert = driver.switchTo().alert();
		String actualalertmsg = alert.getText();
		String expectedalertmsg = "ashwini Jadhav and ash12345 and xoriant";
		if(expectedalertmsg.equals(actualalertmsg)) {
			System.out.println("alert msg is : "+actualalertmsg);
			System.out.println("Test Pass");
		}
		else {
			System.out.println("alert msg is : "+actualalertmsg);
			System.out.println("Test Fail");
		}
			
		
		alert.dismiss();
		//driver.close();
		
		
	}

}
