package basics.multiSelectDropDown;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

//Check Total Available Options in DropDown
public class TotalAvailableOption {
	
	static WebDriver start(String url) {
		System.out.println("Step 1.Launch Browser");
		System.setProperty("webdriver.driver.chrome","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
	
	static void getToatlOptions(String url) throws InterruptedException {
		WebDriver driver = start(url);
		System.out.println("Step 2.AutomationByKrishna.com");
		driver.findElement(By.xpath("//a[@id='basicelements']")).click();
		
		Thread.sleep(3000);
		System.out.println("Step 3.Go to Basic Element link");
		JavascriptExecutor je = (JavascriptExecutor)driver;
		
		WebElement e = driver.findElement(By.xpath("//header[@class='panel-heading'][text()=' Textarea ']"));
		je.executeScript("arguments[0].scrollIntoView(true)",e);
		
		System.out.println("Step 4.Check for Multiselect DropDown - count");
		WebElement multiselectDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select select = new Select(multiselectDropDown);
		List<WebElement> muldropDwon = select.getOptions();
		System.out.println(muldropDwon.size());
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		getToatlOptions("http://automationbykrishna.com");
	}

}
