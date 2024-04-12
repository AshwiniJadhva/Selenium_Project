package basics.multiSelectDropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import base.Prerequisites;

//Deselect the selemet having text 3.
public class DeSelectRequested {
	static void deSelect() {
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
		System.out.println("Step 4.get all selected options");
		List<WebElement>dropDownList1 = multiselect.getAllSelectedOptions();

		for (WebElement dropDwon : dropDownList1) {
			System.out.println(dropDwon.getText());
		}
		
		System.out.println("Step 5.deselect option having text 3 n check options expected - 1,4");
		multiselect.deselectByVisibleText("3");
		List<WebElement>dropDownList2 = multiselect.getAllSelectedOptions();
		System.out.print("remaining selected options are - ");
		int count = 0;
		for(WebElement remainOpt : dropDownList2) {
			System.out.print(remainOpt.getText()+" ");
			count++;
		}
		if(count!=0) {
			System.out.println("Test Pass");
		}
	}
	
	public static void main(String[] args) {
		deSelect();
	}

}
