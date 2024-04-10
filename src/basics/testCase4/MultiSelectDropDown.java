package basics.testCase4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectDropDown {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Launch Chrome Driver");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Step 2.Go to FaceBook Login Page");
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void getAllValuesOfDropDown(String url) throws InterruptedException {
		WebDriver driver = start(url);
		
		System.out.println("Step 3.click on Create new account button");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		System.out.println("Step 4.Get values from DOB dropdown");
		Thread.sleep(5000);
		WebElement dobDropDown = driver.findElement(By.name("birthday_day"));
		Select selectDobDd = new Select(dobDropDown);
		List<WebElement> list = selectDobDd.getOptions();
		for(WebElement e : list) {
			System.out.println(e.getText());
		}
	}
	
	static void getAllValuesOfDropDown1(String url) throws InterruptedException {
		WebDriver driver = start(url);
		
		System.out.println("Step 3.click on Create new account button");
		driver.findElement(By.xpath("//a[text()=\"Create new account\"]")).click();
		
		System.out.println("Step 4.Get values from DOB dropdown");
		Thread.sleep(5000);
		List<WebElement> dobDropDown = driver.findElements(By.name("birthday_day"));
		//Select selectDobDd = new Select(dobDropDown);
		//List<WebElement> list = selectDobDd.getOptions();
		for(WebElement e : dobDropDown) {
			System.out.println(e.getText());
		}
		WebElement e   = dobDropDown.get(5);
		e.click();
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		//getAllValuesOfDropDown("https://www.facebook.com/");
		getAllValuesOfDropDown1("https://www.facebook.com/");
	}

}
