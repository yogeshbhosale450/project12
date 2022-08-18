package Test_NG;

import org.testng.annotations.Test;

public class test_3 extends base_class1 {

	@Test(groups="sanity")
	public void test_1() {
		System.out.println("test1");
	}
	@Test(groups="regression")
	public void test_2() {
		System.out.println("test2");
	}
	@Test(groups="sanity")
	public void test_3() {
		System.out.println("test3");
	}
	
	
	
	
	
}
