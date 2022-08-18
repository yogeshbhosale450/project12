package testnG_crossbrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class amazon extends base_class{

	@Test
	public void amazon1() throws Exception {
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("(//span[@class='a-truncate-cut'])[3]")).click();
		WebElement title=driver.findElement(By.xpath("//span[@id='productTitle']"));
		System.out.println(title.getText());
		
		String Act= driver.getTitle();
		String Exp="amazon.in";

       SoftAssert soft=new SoftAssert();
	soft.assertEquals(Act, Exp);
	System.out.println("yogesh");
	soft.assertAll();
	}
	
	
	
}
