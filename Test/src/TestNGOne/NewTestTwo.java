package TestNGOne;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTestTwo {
	 @Test
	  public void f() {
		  System.out.println("Class two : This is TestOne");
	  }
	  @Test
	  public void f1() {
		  System.out.println("Class two : This is TestTwo");
	  }
	  @Test
	  public void f3() {
		  System.out.println("Class two : This is TestThree");
	  }
	  @BeforeMethod
	  public void beforeMethod() {
	  System.out.println("Class two : This is Before Method");
	  }

	  @AfterMethod
	  public void afterMethod() {
		  System.out.println("Class two : This is After Method");
	  }

	  @BeforeClass
	  public void beforeClass() {
		  System.out.println("Class two : This is BeforeClass");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("Class two : This is after class");
	  }

	  @BeforeTest
	  public void beforeTest() {
		  System.out.println("Class two : This is before test");
	  }

	  @AfterTest
	  public void afterTest() {
		  System.out.println("Class two : This is after Test");
	  }

	  @BeforeSuite
	  public void beforeSuite() {
		  System.out.println("Class two : This is before suite");
	  }

	  @AfterSuite
	  public void afterSuite() {
		  System.out.println("Class two : This is after suite");
	  }

}
