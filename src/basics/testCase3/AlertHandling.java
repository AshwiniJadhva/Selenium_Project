package basics.testCase3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*Javascript
TC#3
click Alert button
Verify - "You must be TechnoCredits student"*/
public class AlertHandling {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Go to AutomationByKrishna.com");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void handleAlert(String url) {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to Basic Element");
		WebElement basicelements = driver.findElement(By.id("basicelements"));
		basicelements.click();
		
		System.out.println("Step 3.click Alert button");
		WebElement alertElement = driver.findElement(By.id("javascriptAlert"));
		alertElement.click();
		
		System.out.println("Step 4.Verify alert msg");
		Alert alert = driver.switchTo().alert();
		String expectedMsg = "You must be TechnoCredits student!!";
		String actualMsg = alert.getText();
		if(expectedMsg.equals(actualMsg))
			System.out.println("Test Pass");
		else System.out.println("Test Failed");
		alert.accept();
		
		System.out.println("Step 5.close the broswer");
		driver.close();
		
	}
	
	public static void main(String[] args) {
		handleAlert("http://automationbykrishna.com/");
	}

}
