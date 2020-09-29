package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@BeforeMethod
	public void beforemethodprecondition() {
		System.out.println("before method in day4 test2");
	}

	@AfterMethod
	public void aftermethodprecondition() {
		System.out.println("after method in day4 test2");
	}
	
	public void WebloginHomeLoan(String urlname ) {
		System.out.println("web login Home");
		System.out.println(urlname);
	}

	@Test(groups= {"smoke"})
	public void MobileloginHomeLoan() {
		System.out.println("smoke test method-group");
	}

	@Test
	public void MobilesigninHomeLoan() {
		System.out.println("day4 method 2");
	}

	@Test
	public void MobilesignoutHomeLoan() {
		System.out.println("day4 method 3");
	}

	@Test
	public void APIloginHomeLoan() {
		System.out.println("day4 method 4");
	}

	
	public void Beforesuiteprecondition() {
		System.out.println("I am before suite");
	}
	
	@BeforeTest
	public void precondition()
	{
		System.out.println("before test coursespace");
	}
	
}
