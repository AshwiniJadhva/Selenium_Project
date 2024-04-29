package basics.webTables;
//1. How many total entries are there in table? -- 57

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;



public class WebTablesDetails extends PredefinedActions{
	
		
		int getTotalEntryCount() {

		System.out.println("Step 2.check total Entry count in table - Expected :57");
		WebElement textElement = driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 57 entries']"));
		String str = textElement.getText();
		String[] arr = str.split("of ");
		String textTemp = arr[1];
		String[] textarr = textTemp.split(" entries");
		String text = textarr[0];
		return Integer.parseInt(text);
	}
	@Test
	void printOutPut() {
		int  output = getTotalEntryCount();
		System.out.println(output);
	}
	
	@Test
	void getEmpCount() {

		ArrayList<String> empCount = new ArrayList<String>();
		System.out.println("Step 3.Get the count of all emp age>25");
		int expectedCount = 48;
		List<WebElement> pageing = driver.findElements(By.xpath(
				"//button[@class='dt-paging-button disabled previous']//following::button[@class='dt-paging-button current' or@class='dt-paging-button']"));
		int pageCount = pageing.size();
		for (int index = 1; index <= pageCount; index++) {
			driver.findElement(By.xpath("//button[text()='" + index + "']")).click();
			List<WebElement> age = driver.findElements(By.xpath("//td[text()>25]"));
			for (WebElement e : age) {
				empCount.add(e.getText());
			}
		}

		int actualCount = empCount.size();
		Assert.assertEquals(expectedCount, actualCount);

	}
	
	@Test
	void getEmpAge() {
	
		System.out.println("Step 2. Get emp age with min salary");
		driver.findElement(By.xpath("//table[@id='example']/thead/tr/th[6]")).click();
		WebElement ele =  driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[4]"));
		String temp = ele.getText();
		int age = Integer.parseInt(temp);
		System.out.println(age);
		
	}
	
	 @Test
	 void getEmpStartDate() {
		
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
	
	@Test
	 void getAllSEemp() {
	
		System.out.println("Step 2.get name of all emp who work as S.E");
		List<WebElement>listEmp = driver.findElements(By.xpath("//td[text()='Software Engineer']//parent::tr/td[1]"));
		for(WebElement emp : listEmp) {
			System.out.println(emp.getText()+" - work as S.E");
		}
	}
	
	
	
	
}
