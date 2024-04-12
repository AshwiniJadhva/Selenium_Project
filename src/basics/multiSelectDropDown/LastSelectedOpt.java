package basics.multiSelectDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Prerequisites;

public class LastSelectedOpt {
	static void lastSelectedOption() {
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
		multiselect.selectByVisibleText("2");
		
		System.out.println("Step 4.get all selected options");
		List<WebElement>dropDownList1 = multiselect.getAllSelectedOptions();
		
		String option = " ";
		for(WebElement dropDown : dropDownList1) {
			System.out.println(dropDown.getText());
			if(dropDown.isSelected()) {
				//System.out.println("Step 5.get lastly selected option - expected : 4");
				option = dropDown.getText();
				
			}
		}
		if(option!=null)
		 System.out.println("lastly selected option -  "+option);

	}
	
	public static void main(String[] args) {
		lastSelectedOption();
	}

}
