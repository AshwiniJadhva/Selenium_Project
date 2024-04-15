package basics.webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//7. Print employee Age whose salary is minimum. 

public class EmpAgewithMinSalary {
	
	static void getEmpAge() {
		WebDriver driver = PredefinedActions.start();
		System.out.println("Step 2. Get emp age with min salary");
		driver.findElement(By.xpath("//table[@id='example']/thead/tr/th[6]")).click();
		WebElement ele =  driver.findElement(By.xpath("//table[@id='example']/tbody/tr[1]/td[4]"));
		String temp = ele.getText();
		int age = Integer.parseInt(temp);
		System.out.println(age);
		
	}
	
	public static void main(String[] args) {
		getEmpAge();
	}

}
