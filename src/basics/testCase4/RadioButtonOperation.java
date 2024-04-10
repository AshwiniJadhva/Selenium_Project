package basics.testCase4;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonOperation {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Launch Chorme Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	//@SuppressWarnings("deprecation")
	static void actionsOnDropDown(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to automationbykrishna.com");
		System.out.println("Step 3.Go to Registation link");
		driver.findElement(By.linkText("Registration")).click();;
		
		System.out.println("Step 4.Check if gender radio button is selected or no");
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Thread.sleep(5000);
		WebElement radioButton1 = driver.findElement(By.xpath("//input[@id='radio-01']"));
		if(radioButton1.isSelected()) {
			WebElement radioButton2 = driver.findElement(By.id("radio-02"));
			radioButton2.click();
			System.out.println(radioButton2.getAttribute("Female")+" is selected");
		}
			
	}
	public static void main(String[] args) throws InterruptedException {
		actionsOnDropDown("http://automationbykrishna.com");
	}
	
}
