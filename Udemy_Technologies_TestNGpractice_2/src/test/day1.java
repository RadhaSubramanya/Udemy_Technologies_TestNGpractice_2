package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	@AfterSuite
	public void Aftersuitepostcondition() {
		System.out.println("I am after suite");
	}
	@Parameters({"url","name"})
	@Test
	public void m1(String url,String name) {
		System.out.println("Hi Radha");
		System.out.println(url);
		System.out.println(name);
	}
	
	@Parameters({"name"})
	@Test
	public void m12(String name) {
		System.out.println("Hi Radha 2");
		System.out.println(name);
	}
	
	@Test
	public void m2() {
		System.out.println("bye Radha");
	}
	@BeforeSuite
	public void Beforesuiteprecondition() {
		System.out.println("I am before suite");
	}
}
