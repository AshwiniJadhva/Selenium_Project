package basics.multiSelectDropDown;
//without using getFirstSelectedOptions() method print firstly selected option.

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Prerequisites;
public class PrintFirstSelectedOption {
	
	static void getFirstSelectedOpt() {
		WebDriver driver = Prerequisites.start();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		System.out.println("Step 2.Go to basic elemets link");
		driver.findElement(By.id("basicelements")).click();
		
		WebElement e = driver.findElement(By.xpath("//header[@class='panel-heading'][text()=' Textarea ']"));
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("arguments[0].scrollIntoView(true)",e);
		
		System.out.println("Step 4.Click on Some option from dropDown");
		
		WebElement multiselectDropDown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select multiselect = new Select(multiselectDropDown);
		multiselect.selectByVisibleText("1");
		multiselect.selectByVisibleText("3");
		multiselect.selectByVisibleText("4");
		System.out.println("Step 4.get firstly selected option from drop down - 1");
		List<WebElement>dropDownList = multiselect.getAllSelectedOptions();

		for (WebElement dropDwon : dropDownList) {
			System.out.println("firstly selected option from drop down - "+dropDwon.getText());
			System.out.println("Test Pass");
			break;
		}
		
		
	}
	public static void main(String[] args) {
		getFirstSelectedOpt();
	}

}
