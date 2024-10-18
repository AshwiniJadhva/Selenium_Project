package dataProvider;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test(dataProvider="loginDataProvider")
	public void doLogin(String userName ,String password, String expectedResult) throws InterruptedException {
		
		System.setProperty("WebDriver.driver.chrome", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://automationbykrishna.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("registration2")).click();
		
		Thread.sleep(3000);
		driver.findElement(By.id("unameSignin")).sendKeys(userName);
		driver.findElement(By.id("pwdSignin")).sendKeys(password);
		driver.findElement(By.id("btnsubmitdetails")).click();
		Alert alert = driver.switchTo().alert();
		String actaulResult = alert.getText();
		Assert.assertEquals(expectedResult,actaulResult);
		alert.accept();
		driver.close();
	}
	
	@DataProvider(name="loginDataProvider")
	Object[][] validateLoginData(){
		Object[][] data = new Object[5][3];
		
		data[0][0] = "ajadhav";
		data[0][1] = "ajadhav123";
		data[0][2] = "Success!";
		
		data[1][0] = "ajadhav";
		data[1][1] = "ajadhav123";
		data[1][2] = "Success!";
		
		data[2][0] = "ajinkya";
		data[2][1] = "ashwini";
		data[2][2] = "Failed! please enter strong password";
		
		data[3][0] = "ajadhav";
		data[3][1] = "ashwini123";
		data[3][2] = "Success!";
		
		data[4][0] = "ajadhav";
		data[4][1] = "ajadhav";
		data[4][2] = "Failed! please enter strong password";
		
		return data;
	}
	

}
