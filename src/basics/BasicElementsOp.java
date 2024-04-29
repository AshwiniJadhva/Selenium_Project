package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BasicElementsOp extends GoToUrl{
	
	@Test
	void handleAlert() throws InterruptedException {
		//WebDriver driver = start();

		System.out.println("Step 3.click Alert button");
		Thread.sleep(4000);
		WebElement alertElement = driver.findElement(By.id("javascriptAlert"));
		alertElement.click();

		System.out.println("Step 4.Verify alert msg");
		Alert alert = driver.switchTo().alert();
		String expectedMsg = "You must be TechnoCredits student!!";
		String actualMsg = alert.getText();
		Assert.assertEquals(expectedMsg, actualMsg);

		alert.accept();

		tearDonw();

	}
	
	@Test
	void getAlertText() throws InterruptedException {
		//WebDriver driver = start();

		System.out.println("Step 3. Interaction with alert demo section - Enter First Name");
		Thread.sleep(3000);
		WebElement fnameTextBox = driver.findElement(By.xpath("//input[@id='UserFirstName']"));
		fnameTextBox.sendKeys("Ashwini");

		System.out.println("Step 4.Enter Last Name");
		WebElement lnameTextBox = driver.findElement(By.id("UserLastName"));
		lnameTextBox.sendKeys("Jadhav");

		System.out.println("Step 5.Enter Company Name");
		WebElement comNameTextBox = driver.findElement(By.id("UserCompanyName"));
		comNameTextBox.sendKeys("Xorinat");

		System.out.println("Step 6.Click On Submit Button");
		WebElement button = driver.findElement(By.xpath("//button[@onclick= 'myFunctionPopUp()']"));
		button.click();

		System.out.println("Step 7.Verify alert msg with all details");
		String expectedAlertmsgforAlldetails = "Ashwini and Jadhav and Xorinat";
		String expectedAlertmsgforNodetails = " and  and ";
		Alert alert = driver.switchTo().alert();
		String actualAlertmsgforAlldetails = alert.getText();
		Assert.assertEquals(actualAlertmsgforAlldetails , expectedAlertmsgforAlldetails);
			
		
		alert.accept();

		System.out.println("Step 7.Verify alert msg with No details");

		driver.findElement(By.xpath("//input[@id='UserFirstName']")).clear();
		driver.findElement(By.id("UserLastName")).clear();
		driver.findElement(By.id("UserCompanyName")).clear();
		// System.out.println(actualAlertmsgforNodetails);
		driver.findElement(By.xpath("//button[@onclick= 'myFunctionPopUp()']")).click();
		String actualAlertmsgforNodetails = alert.getText();

		Assert.assertEquals(actualAlertmsgforNodetails, expectedAlertmsgforNodetails);

		alert.accept();
		tearDonw();
	}
	
	@Test
	void javaScriptConformationAlert() throws InterruptedException {
		// WebDriver driver = start();

		System.out.println("Step 3.click on javaScript conformation aler");
		Thread.sleep(4000);
		WebElement javascriptconalter = driver.findElement(By.id("javascriptConfirmBox"));
		javascriptconalter.click();

		Alert alert = driver.switchTo().alert();

		System.out.println("Step 4.Click on OK n Verify msg");
		String expectedOKmsg = "You pressed OK!";
		alert.accept();
		WebElement OK = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualOKmsg = OK.getText();
		Assert.assertEquals(expectedOKmsg, actualOKmsg);

		System.out.println("Step 5.Click on CANCEL n Verify msg");
		String expectedCancelmsg = "You pressed Cancel!";
		driver.findElement(By.id("javascriptConfirmBox")).click();
		alert.dismiss();
		WebElement cancel = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualCancelmsg = cancel.getText();
		Assert.assertEquals(expectedCancelmsg, actualCancelmsg);
		tearDonw();

	}

	@Test
	 void javaScriptPromtAlert() throws InterruptedException {
		//WebDriver driver = start();

		System.out.println("Step 3.click on javaScript promt alert");
		Thread.sleep(3000);
		WebElement promtAlert = driver.findElement(By.xpath("//button[@id='javascriptPromp']"));
		promtAlert.click();

		System.out.println("Step 4.Enter value to the javascrpit Promt");
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Ashwini");
		Thread.sleep(5000);
		alert.accept();

		
		System.out.println("Step 5. press on OK n verfiy msg");
		String expectedOKAlertmsg = "Hello Ashwini! How are you today?";
		WebElement alertOKmsg = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualOKAlertmsg = alertOKmsg.getText();
		Assert.assertEquals(expectedOKAlertmsg , actualOKAlertmsg);
			
		
		
		System.out.println("Step 5. press on Cancel n verfiy msg");
		driver.findElement(By.id("javascriptPromp")).click();
		alert.dismiss();
		String expectedCancelMsg = "User cancelled the prompt.";
		WebElement cancelmsg = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualCancelMsg = cancelmsg.getText();

		Assert.assertEquals(expectedCancelMsg , actualCancelMsg);
		tearDonw();
	}
	
	@Test
	 void emailFormAlter() throws InterruptedException {
		//WebDriver driver = start();
		
		Thread.sleep(5000);
		System.out.println("Step 3.Interaction with Basic Form section - Enter email address");
		WebElement uEmail = driver.findElement(By.id("exampleInputEmail1"));
		uEmail.sendKeys("abc@gmail.com");
		
		System.out.println("Step 4.Enter Password");
		WebElement password = driver.findElement(By.id("pwd"));
		password.sendKeys("12345");
		
		System.out.println("Step 5.click on Submit Button");
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		
		System.out.println("Step 6.Verify ALert mgs");
		Alert alert = driver.switchTo().alert();
		String expectedAlertMsg = "You successfully clicked on it";
		String actualAlertMsg = alert.getText();
		alert.accept();
		
		Assert.assertEquals(actualAlertMsg , expectedAlertMsg);
		tearDonw();	
	}


}


