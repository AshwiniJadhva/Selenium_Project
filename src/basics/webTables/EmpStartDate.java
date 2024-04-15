package basics.webTables;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//6. Print Employee Start date whose age is 66.

public class EmpStartDate {
	
	static void getEmpStartDate() {
		WebDriver driver = PredefinedActions.start();
		System.out.println("Step 2.Get Emp start dates ");
		ArrayList<String> startDate = new ArrayList<String>();
		List<WebElement>pageing = driver.findElements(By.xpath("//button[@class='dt-paging-button disabled previous']//following::button[@class='dt-paging-button current' or@class='dt-paging-button']"));
		int pageNumber = pageing.size();
		for(int index = 1; index<=pageNumber; index++) {
			driver.findElement(By.xpath("//button[text()='"+index+"']")).click();
			List<WebElement> age = driver.findElements(By.xpath("//td[text()='66']//following-sibling::td[1]"));
			for(WebElement e : age) {
				startDate.add(e.getText());
			}
		}
		System.out.println(startDate);
		System.out.println("Step 3.close Browser");
		driver.close();
	}
	
	public static void main(String[] args) {
		getEmpStartDate();
	}

}
