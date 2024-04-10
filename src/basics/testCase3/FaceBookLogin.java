package basics.testCase3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookLogin {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Go FaceBook Login Page");
		System.setProperty("webdriver.driver.chrom", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS);
	
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void loginToFaceBook(String url)  {
		
		WebDriver driver = start(url);
		


		System.out.println("Step 3 -Click on Create Account ");

		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		
		
		System.out.println("Step 4.Fill all details");
		WebElement fName = driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.sendKeys("abc");
		
		WebElement lName = driver.findElement(By.xpath("//input[@name='lastname']"));
		lName.sendKeys("Jac");
		
		WebElement email = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		email.sendKeys("345638762834");
		
		WebElement pass = driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys("2134dg@A");
		
		WebElement dayDropDown = driver.findElement(By.xpath("//select[@name ='birthday_day']"));
		Select selectDay = new Select(dayDropDown);
		selectDay.selectByValue("23");
		
		WebElement monthDropDown = driver.findElement(By.xpath("//select[@name ='birthday_month']"));
		Select selectMonth = new Select(monthDropDown);
		selectMonth.selectByValue("4");
		
		WebElement yearDropDown = driver.findElement(By.xpath("//select[@name ='birthday_year']"));
		Select selectYear = new Select(yearDropDown);
		selectYear.selectByValue("1993");
		
		
		
		WebElement gender = driver.findElement(By.xpath("//input[@name='sex'][@value='1']"));
		gender.click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement submit = driver.findElement(By.xpath("//button[@name='websubmit'][@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']"));
		submit.click();
		
		
		
	}
	
	public static void main(String[] args) {
		loginToFaceBook("https://www.facebook.com/");
	}

}
