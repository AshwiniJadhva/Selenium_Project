package basics.webTables;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//5. COunt number of Employee with age More than 25, on first page.

public class CountEmpAgeMoreThan25 {
	
	static void getEmpCount() {
		WebDriver driver = PredefinedActions.start();
		ArrayList<String> empCount =new  ArrayList<String>();
		System.out.println("Step 3.Get the count of all emp age>25");
		int expectedCount = 48;
		List<WebElement>pageing = driver.findElements(By.xpath("//button[@class='dt-paging-button disabled previous']//following::button[@class='dt-paging-button current' or@class='dt-paging-button']"));
		int pageCount = pageing.size();
		for(int index = 1; index<=pageCount; index++) {
			driver.findElement(By.xpath("//button[text()='"+index+"']")).click();
			List<WebElement> age = driver.findElements(By.xpath("//td[text()>25]"));
			for(WebElement e : age) {
				empCount.add(e.getText());
			}
		}
		
		int actualCount = empCount.size();
		System.out.println(actualCount);
		if(expectedCount==actualCount)
			System.out.println("Test Pass");
		else System.out.println("Test Failed");
		
		driver.close();
	}
	
	public static void main(String[] args) {
		getEmpCount();
	}

}
