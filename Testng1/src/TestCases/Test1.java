package TestCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
	
	
	@Test(priority= -2,invocationCount=2)//1
	public void a1() {
		System.out.println("prin t selenium");
	}
	
	@Test(priority = 2,enabled=false)//3
	public void a2 (){
		System.out.println("add one");
	}
	@Test(priority=1)//2
	public void a3() {
		System.out.println("one method");
	}
	@Test(priority = 2,dependsOnMethods="a3")//4
		public void a4() {
			System.out.println("one test case");
		}
	}


