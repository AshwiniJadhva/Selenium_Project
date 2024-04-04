package basics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*TC#4
JS confirmation
Read message and accordingly click - OK and cancel
A label is added. get this label using getText(); and now verify based on below conditions -
based on OK - "You pressed OK" 
based on Cancel -  "You pressed Cancel!"*/


public class JavaScriptConFormationAlertHandling {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Go to AutomationByKrishna.com");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void javaScriptConformationAlert(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to Basic Element");
		WebElement basicelements = driver.findElement(By.id("basicelements"));
		basicelements.click();
		
		System.out.println("Step 3.click on javaScript conformation aler");
		Thread.sleep(4000);
		WebElement javascriptconalter = driver.findElement(By.id("javascriptConfirmBox"));
		javascriptconalter.click();
		
		System.out.println();
		Alert alert = driver.switchTo().alert();
		String expectedAlertmsg = "String expectedAlertmsg";
		String actualAlertmsg = alert.getText();
		if(expectedAlertmsg.equals(actualAlertmsg))
			System.out.println("Test Pass");
		else System.out.println("Test Failed");
		
		System.out.println("Step 4.Click on OK n Verify msg");
		String expectedOKmsg = "You pressed OK!";
		alert.accept();
		WebElement OK = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualOKmsg = OK.getText();
		if(expectedOKmsg.equals(actualOKmsg))
			System.out.println("OK msg Test Pass");
		else System.out.println("OK msg Test Failed");
		
		System.out.println("Step 5.Click on CANCEL n Verify msg");
		String expectedCancelmsg = "You pressed Cancel!";
		driver.findElement(By.id("javascriptConfirmBox")).click();
		alert.dismiss();
		WebElement cancel = driver.findElement(By.xpath("//p[@id='pgraphdemo']"));
		String actualCancelmsg = cancel.getText();
		if(expectedCancelmsg.equals(actualCancelmsg))
			System.out.println("Cancel msg Test Pass");
		else System.out.println("Cancel msg Test Failed");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		javaScriptConformationAlert("http://automationbykrishna.com/");
	}
	

}
