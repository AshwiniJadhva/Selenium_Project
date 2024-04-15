package basics.webTables;
//8. How many rows in Table on first page.
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RowCountOnFirstPage {
	
	static void getCount() {
		WebDriver driver = PredefinedActions.start();
		System.out.println("Step 2.Get row count of first page");
		int expectedrowcount = 10;
		int actualrowcount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr")).size();
		if(expectedrowcount ==actualrowcount)
			System.out.println("Test Pass");
		else System.out.println("Test Failed");
	}
	
	public static void main(String[] args) {
		getCount();
	}

}
