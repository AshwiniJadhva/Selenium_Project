package basics;

/*TC#1 - First Box
- Enter Fname, Lname and Company name.
- click submit.
- you should get alert; get that text and verify.*/
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAlertText {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.open automationbykrishna.com");
		System.setProperty("webdriver.driver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void getAlertText(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to Basic Element");
		WebElement basicelements = driver.findElement(By.id("basicelements"));
		basicelements.click();
		
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
		if(actualAlertmsgforAlldetails.equals(expectedAlertmsgforAlldetails))
				System.out.println("All details Test Pass");
		else System.out.println("All details Test Failed");
		alert.accept();
		
		System.out.println("Step 7.Verify alert msg with No details");
		
		driver.findElement(By.xpath("//input[@id='UserFirstName']")).clear();
		driver.findElement(By.id("UserLastName")).clear();
		driver.findElement(By.id("UserCompanyName")).clear();
		//System.out.println(actualAlertmsgforNodetails);
		driver.findElement(By.xpath("//button[@onclick= 'myFunctionPopUp()']")).click();
		String actualAlertmsgforNodetails = alert.getText();
		
		if(actualAlertmsgforNodetails.equals(expectedAlertmsgforNodetails))
			System.out.println("No details Test pass");
		else System.out.println("No details Test Failed");
		
		alert.accept();
		System.out.println("Step 8.Close The Browser");
		driver.quit();
			
	}
	
	public static void main(String[] args) throws InterruptedException {
		getAlertText("http://automationbykrishna.com/");
	}

}
