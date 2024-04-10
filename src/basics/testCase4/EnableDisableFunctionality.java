package basics.testCase4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//2. validate enable button functionality click on button and validate button is disable or not and vice versa.

public class EnableDisableFunctionality {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Launch Chorme Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void checkEnableDisable(String url) {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to file:///E:/ashwiniProjects/Selenium_Project/resources.forms/Enable_And_Disable_&_Display_&_Hide_Form.html");
		
		System.out.println("Step 3.Check button enable or disable");
		System.out.println("Step 3.1.Check after Fisrt Time Login, button is enable or not");
		WebElement buttonEnableDisable = driver.findElement(By.xpath("//button[text()='Enable & Disable Button']"));
		if(buttonEnableDisable.isEnabled()) {
			System.out.println("after Fisrt Time Login, Enable&Dusable button is enable - Test Pass");
		}
		else System.out.println("after Fisrt Time Login, Enable&Dusable button is disable - Test Failed");
		
		driver.findElement(By.id("myText")).sendKeys("Ashwini");
		
		buttonEnableDisable.click();
		try {
			driver.findElement(By.id("myText")).clear();
			
		}
		catch(JavascriptException je) {
			
			System.out.println("Step 3.2.Check After click on Enable&Dusable Button button is disable or not");
			if(buttonEnableDisable.isEnabled()) {
				System.out.println("After click on Enable&Dusable Button button is disable - Test Pass");
			}
			else System.out.println("After click on Enable&Dusable Button button is enable - Test Failed");
		}

	}
	public static void main(String[] args) {
		checkEnableDisable("E:\\ashwiniProjects\\Selenium_Project\\resources.forms\\Enable_And_Disable_&_Display_&_Hide_Form.html");
	}
	

}
