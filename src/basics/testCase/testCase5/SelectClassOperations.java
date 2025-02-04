package basics.testCase.testCase5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.bytebuddy.implementation.bytecode.Duplication;



/*
 * 12 jun 2021
Test Case 5 :
String url= https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html';
1.open url on browser
2.Select any day from dropdown
3. select multiple values from multilist Demo 
4. deselect all the selected options and select remaining option
 */
public class SelectClassOperations {
	
	WebDriver driver;
	@BeforeMethod
	 void start() {
		System.out.println("Step 1. Lounch Browser and go to automationbykrishna.com");
		System.setProperty("Webdriver.driver.chrome", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationbykrishna.com/");
		System.out.println("Step 2. got to basic elememts ");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		
	}
	//@AfterMethod
	void tearDown() {
		driver.close();
	}
	
	@Test
	void testCase() {
		
		System.out.println("Step 3.Select any day from dropdown");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//select[@class='form-control m-bot15']")));
		WebElement dropDownEle = driver.findElement(By.xpath("//select[@class='form-control m-bot15']"));
		dropDownEle.click();
		Select select = new Select(dropDownEle);
		//select.selectByVisibleText("1");
		//select.selectByVisibleText("3");
		select.selectByVisibleText("5");
		
		System.out.println("step 4. select multiple values from multilist Demo ");
		WebElement multiSelectdropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select multiSelcet = new Select(multiSelectdropDown);
		multiSelcet.selectByVisibleText("1");
		select.selectByVisibleText("2");
		select.selectByVisibleText("3");
		select.selectByVisibleText("5");
		
	}

}
