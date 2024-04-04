package basics;

/*TC#2 - Second Box
- Enter email
- Enter password
- verify message "You successfully clicked on it"*/
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToEmailForm {
	static WebDriver start(String url) {
		System.out.println("Step 1.Go to AutomationByKrishna.com");
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void emailFormAlter(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to Basic Element");
		WebElement basicelements = driver.findElement(By.id("basicelements"));
		basicelements.click();
		
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
		
		if(actualAlertMsg.equals(expectedAlertMsg))
			System.out.println("Test Pass");
		
		else System.out.println("Test Failed");
		
		System.out.println("Step 7.Clase The Browser");
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		emailFormAlter("http://automationbykrishna.com/");
	}

}
