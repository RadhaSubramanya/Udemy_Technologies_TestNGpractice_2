package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 
{


public void m3()
{
	System.out.println("Good");
}

@BeforeTest
public void precondition()
{
	System.out.println("before test workspace");
}

/*@BeforeSuite
public void Beforesuiteprecondition() {
	System.out.println("I am before suite2");
}*/
}
