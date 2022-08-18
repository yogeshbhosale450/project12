package Test_NG;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

public class a1 extends base_class1 {

	@Test(groups="regression")
	public void M1() {
		System.out.println("its m1");
	}
	@Test
	public void M2() {
		System.out.println("its m2");
		assertTrue(false);
	}
	@Test(groups="sanity")
	public void M3() {
		System.out.println("its m3");
	}
	@Test
	public void M4() {
		System.out.println("its m4");
	}
	@Test(groups="sanity")
	public void M5() {
		System.out.println("its m5");
	}
	
	
	
	
	
	
	
	
	
}
