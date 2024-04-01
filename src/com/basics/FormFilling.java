package com.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.basics.base.Prerequisites;

public class FormFilling {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = Prerequisites.starts("https://www.facebook.com/");
		
		System.out.println("Step 3. click on create account button");
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(10000);
		
		System.out.println("Step 4. Enter First Name ");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Aashwini");
		
		System.out.println("Step 5. Enter Last Name");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Ghorpade");
		
		System.out.println("Step 6. Enter Mobile number or email");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("8596035745");
		
		System.out.println("Step 7. Enter Password");
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("ashu12345");
		String password= pass.getAttribute("value");
		System.out.println("passwors is :"+password);
		
		System.out.println("Step 8. Select DOB - Day");
		WebElement dobD = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select dobDropDown = new Select(dobD);
		dobDropDown.selectByValue("23");
		
		System.out.println("Step 9. Select DOB - Month");
		WebElement dobM = driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select dobMDropDown = new Select(dobM);
		dobMDropDown.selectByVisibleText("Apr");
		
		System.out.println("Step 10. Select DOB - Year");
		WebElement dobY = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select dobYDropDown = new Select(dobY);
		dobYDropDown.selectByValue("1993");
		
		System.out.println("Step 11. select Genger ");
		driver.findElement(By.xpath("//input[@value='1']")).click();
		driver.close();
		
		

	}

}
