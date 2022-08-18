package Test_NG;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class test_1 extends base_class{

	@Test(groups="sanity")
	public void amazon_search() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
	}
	@Test(groups="regression")
	public void check_box() {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[4]")).click();
	}
	
	
	
	
}
