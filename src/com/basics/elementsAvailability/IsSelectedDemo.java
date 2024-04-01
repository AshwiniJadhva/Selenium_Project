package com.basics.elementsAvailability;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.basics.base.Prerequisites;

public class IsSelectedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = Prerequisites.starts("http://automationbykrishna.com/#");
		driver.findElement(By.id("")).isDisplayed();
		
	}

}
