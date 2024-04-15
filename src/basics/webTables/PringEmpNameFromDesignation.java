package basics.webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.Prerequisites;

//4. Find all Employees who hold Position as Software Engineer.

public class PringEmpNameFromDesignation {
	
	static void getAllSEemp() {
		WebDriver driver = PredefinedActions.start();
		System.out.println("Step 2.get name of all emp who work as S.E");
		List<WebElement>listEmp = driver.findElements(By.xpath("//td[text()='Software Engineer']//parent::tr/td[1]"));
		for(WebElement emp : listEmp) {
			System.out.println(emp.getText()+" - work as S.E");
		}
	}
	public static void main(String[] args) {
		getAllSEemp();
	}

}
