package basics.testCase4;
import org.openqa.selenium.By;
// TC 1. validate visible button functionality click on button and validate button block is displayed or not and vice versa.
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckElementVisibility {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Launch Chorme Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void checkElementsAvailability(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to file:///E:/ashwiniProjects/Selenium_Project/resources.forms/Enable_And_Disable_&_Display_&_Hide_Form.html");
		
		System.out.println("Step 3.check button visbility n hide functionlity");
		
		System.out.println("Step 3.1.Check after Fisrt Time Login, block is visible or not");
		WebElement block = driver.findElement(By.xpath("//div[@id='myDIV']"));
		boolean isVisible = block.isDisplayed();
		if(isVisible) {
			System.out.println("After Fisrt Time Login , block is visible - Test Pass");
		}
		else System.out.println("After Fisrt Time Login , block is not visible - Test Failed");
		
		
		Thread.sleep(5000);
		
		System.out.println("Step 3.2.check After click on Visible n Hide Button, Block is visible or not");
		WebElement visibleHideButton = driver.findElement(By.xpath("//button[text()=\"Visiable & Hidden Button\"]"));
		visibleHideButton.click();
		isVisible = driver.findElement(By.xpath("//div[@id='myDIV']")).isDisplayed();

		if (!isVisible) {
			System.out.println("After click on Visible n Hide Button, Block is invisible  - Test Pass");
		} else
			System.out.println("After click on Visible n Hide Button Block is visible  - Test Failed");
		
		System.out.println("Step 3.3.check After click on Visible n Hide Button, Block is invisible or not");
		driver.findElement(By.xpath("//button[text()=\"Visiable & Hidden Button\"]")).click();
		isVisible = driver.findElement(By.xpath("//div[@id='myDIV']")).isDisplayed();
		if(isVisible)
			System.out.println("After click on Visible n Hide Button Block is visible  - Test Pass");
		else System.out.println("After click on Visible n Hide Button Block is invisible  - Test Failed");
		
		System.out.println("Step 4.close Browser");
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		checkElementsAvailability("E:\\ashwiniProjects\\Selenium_Project\\resources.forms\\Enable_And_Disable_&_Display_&_Hide_Form.html");
	}
	

}
