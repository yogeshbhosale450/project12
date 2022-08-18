package Test_NG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class test_assert extends base_class {

	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Test
	public void test2() {
		System.out.println("username");
		System.out.println("password");
		String act="yogesh";
		String exp="Yogesh";
		
		Assert.assertEquals(act, exp);
		System.out.println("nikita");
	}
	@Test
	public void test3() {
		System.out.println("7276040828");
		String actual="mom";
		String expected="MOM";
	
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(actual, expected);
		System.out.println("nikita");
		soft.assertAll();
	}
	
	
	
	
	
	
	
	
}
