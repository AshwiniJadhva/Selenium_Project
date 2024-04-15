package basics.webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Prerequisites;

//2. On Dynamic table - check age of Employee "Vaesar Vance" - write Dynamic Xpath - Print Age

public class PrintAgefromName {
	
	static void getAge(String url) {
		WebDriver driver = Prerequisites.start(url);
		System.out.println("Step 2.Get age of emp - expected - 21");
		int expectedAge = 21;
		WebElement element = driver.findElement(By.xpath("//td[text()='Caesar Vance']//following-sibling::td[3]"));
		String str  = element.getText();
		int actualAge  = Integer.parseInt(str);
		if(expectedAge==actualAge) {
			System.out.println("Actal age is "+actualAge);
			System.out.println("Test Pass");
		}
		else System.out.println("Test Failed");
	}
	public static void main(String[] args) {
		getAge("https://datatables.net/");
	}

}
