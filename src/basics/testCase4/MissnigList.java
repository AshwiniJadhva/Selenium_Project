package basics.testCase4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Tc- to check if link is available to not.

public class MissnigList {

	static WebDriver start(String url) {
		System.out.println("Step 1.Launch Chrome Browser");
		System.setProperty("webdriver.driver.chrom","chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		return driver ;
	}
	
	static void checkLinkAvailability(String url) {
		WebDriver driver = start(url);
		System.out.println("Step 2.Go to file:///E:/ashwiniProjects/Selenium_Project/resources.forms/MissingLink.html");
		System.out.println("Step 3.Check Links availability");
		List<WebElement> linkList = driver.findElements(By.xpath("//a"));
		for(WebElement e :linkList) {
			String hrefValue = e.getAttribute("href");
			if(hrefValue==null) {
				System.out.println("href is missing for - "+e.getText());
			}
			else if(hrefValue!=null) {
				if(!hrefValue.isBlank()) {
					System.out.println(e.getText()+" link is available");
				}
				else System.out.println("link is missing for - "+e.getText());
			}
		}
		
		System.out.println("Step 4.close browser");
		driver.close();
	}
	
	public static void main(String[] args) {
		checkLinkAvailability("file:///E:/ashwiniProjects/Selenium_Project/resources.forms/MissingLink.html");
	}
	
}
