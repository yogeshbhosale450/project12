package Test_NG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class test_2 {
	
	@Test
	public void a1() {
		System.out.println("a1");
		assertTrue(false);
	}
	@Test(dependsOnMethods="a1")
	public void a2() {
		System.out.println("a2");
	}
	@Test
	public void a3() {
		System.out.println("a3");
	}
	
	
	
	
	
	
	
	


}
