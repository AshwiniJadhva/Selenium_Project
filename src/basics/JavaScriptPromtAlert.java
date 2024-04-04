package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
TC#5
JS Prompt
- click JS Prompt
- switch to alert
- enter name
- from the message verify that "given name" is present.
*/
public class JavaScriptPromtAlert {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Go to AutomationByKrishna.com");
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void javaScriptPromtAlert(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to Basic Element");
		WebElement basicelements = driver.findElement(By.id("basicelements"));
		basicelements.click();

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
		if (expectedOKAlertmsg.equals(actualOKAlertmsg))
			System.out.println("OK option Test Pass");
		else
			System.out.println("OK option Test Failed");

		
		System.out.println("Step 5. press on Cancel n verfiy msg");
		driver.findElement(By.id("javascriptPromp")).click();
		alert.dismiss();
		String expectedCancelMsg = "User cancelled the prompt.";
		WebElement cancelmsg = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualCancelMsg = cancelmsg.getText();

		if (expectedCancelMsg.equals(actualCancelMsg))
			System.out.println("Cancel option Test Pass");
		else
			System.out.println("Cancel option Test Falied");

	}
	
	public static void main(String[] args) throws InterruptedException {
		javaScriptPromtAlert("http://automationbykrishna.com/");
	}

}
