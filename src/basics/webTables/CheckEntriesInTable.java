package basics.webTables;
//1. How many total entries are there in table? -- 57

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;



public class CheckEntriesInTable {
	@Test
	static int getTotalEntryCount() {
		WebDriver driver = PredefinedActions.start();
		System.out.println("Step 2.check total Entry count in table - Expected :57");
		WebElement textElement = driver.findElement(By.xpath("//div[text()='Showing 1 to 10 of 57 entries']"));
		String str =  textElement.getText();
		String[] arr = str.split("of ");
		String textTemp = arr[1];
		String[] textarr = textTemp.split(" entries");
		String text = textarr[0];
		return Integer.parseInt(text);
	}
	
	public static void main(String[] args) {
		int count = getTotalEntryCount();
		System.out.println("actual count - "+count+" Text Pass");
	}

}
