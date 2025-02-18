package com.orgHRM.testscript;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.orgHRM.base.PredefinedAction;


public class DashBorardTest extends PredefinedAction{
	
	@Test
	void dashboardTest() throws InterruptedException{
		
		System.out.println("STEP 1. Lounch Broswer and open URL");
		PredefinedAction.start();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		System.out.println("STEP 2. Check available wigdets");
		int actualWidgetsCount = 7;
		Thread.sleep(3000);
		int expectedWidgetCount = driver.findElements(By.xpath("//div[@class='oxd-grid-item oxd-grid-item--gutters orangehrm-dashboard-widget']")).size();
		Assert.assertEquals(expectedWidgetCount, actualWidgetsCount);
	}
	
	@AfterTest
	void getWidgetText() {
		
		ArrayList<String> wedgetTextList = new ArrayList<String>();
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='orangehrm-dashboard-widget-name']"));
		for(WebElement e :list) {
			wedgetTextList.add(e.getText());
			
		}
		System.out.println(wedgetTextList);
	
	}

}
