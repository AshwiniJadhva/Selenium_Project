package trynerror;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassOne {
	
	 @BeforeTest
	    public void beforeTest() {
	        System.out.println("✅ @BeforeTest - Runs ONCE before all tests in <test> group (TestClassOne)");
	    }

	    @BeforeMethod
	    public void beforeMethod() {
	        System.out.println("🔹 @BeforeMethod - Runs before each @Test in TestClassOne");
	    }

	    @Test
	    public void testA() {
	        System.out.println("🔸 Test A Executed.");
	    }

	    @Test
	    public void testB() {
	        System.out.println("🔸 Test B Executed.");
	    }

	    @AfterMethod
	    public void afterMethod() {
	        System.out.println("🔹 @AfterMethod - Runs after each @Test in TestClassOne");
	    }

	    @AfterTest
	    public void afterTest() {
	        System.out.println("✅ @AfterTest - Runs ONCE after all tests in <test> group (TestClassOne)");
	    }

}
