package trynerror;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestClassTwo {
	
	@BeforeTest
    public void beforeTest() {
        System.out.println("✅ @BeforeTest - Runs ONCE before all tests in <test> group (TestClassTwo)");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("🔹 @BeforeMethod - Runs before each @Test in TestClassTwo");
    }

    @Test
    public void testC() {
        System.out.println("🔸 Test C Executed.");
    }

    @Test
    public void testD() {
        System.out.println("🔸 Test D Executed.");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("🔹 @AfterMethod - Runs after each @Test in TestClassTwo");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("✅ @AfterTest - Runs ONCE after all tests in <test> group (TestClassTwo)");
    }

}
