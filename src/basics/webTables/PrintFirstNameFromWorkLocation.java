package basics.webTables;



//3. Print Employee First Name of all employees working from London Office.

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PrintFirstNameFromWorkLocation {
	
	static void getAllEmpFirstName() {
		WebDriver driver = PredefinedActions.start();
		System.out.println("Step 2. get first name of all emp");
		List<WebElement>empList = driver.findElements(By.xpath("//td[text()='London']//parent::tr/td[1]"));
		for(WebElement emp : empList) {
			System.out.println(emp.getText()+" : work from London Office");
		}
	}
	
	
	
	public static void main(String[] args) {
		getAllEmpFirstName();
		
	}

}
