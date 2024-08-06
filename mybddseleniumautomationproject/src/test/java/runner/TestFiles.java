package runner;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestFiles {
	
	
	@Test
	public void t1() {
		
		System.out.println("t1()");
	}
	
	@Test
	public void t2() {
		System.out.println("t2()");
	}
	
	@AfterClass
	public void t3() {
		System.out.println("t3()");
	}

}
