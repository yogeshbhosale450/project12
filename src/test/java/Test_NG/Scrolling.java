package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scrolling extends base_class1{

	@Test
	public void scroll() throws Exception {
		
		driver.get("https://www.amazon.in/");
		  
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,2000)", "");
		//js.executeScript("window.scrollBy(0,-2000)", "");
		//Thread.sleep(5000);
		WebElement fb=driver.findElement(By.xpath("//a[text()='Facebook']"));
		//js.executeScript("arguments[0].scrollIntoView()",fb);
		Thread.sleep(5000);
		Scrolling.scrollingdown(driver, fb);
	}
	
	
	
	
}
