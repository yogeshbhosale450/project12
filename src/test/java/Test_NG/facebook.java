package Test_NG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class facebook extends base_class {

	@Test
	public void fb() throws Exception {
		driver.get("https://www.facebook.com/");
		//Thread.sleep(5000);
		WebElement txt=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		System.out.println(txt.getText());
		String act=txt.getText();
		String exp="Forgotten password?";
		Assert.assertEquals(act, exp);
		System.out.println("nikita");
	}
	
	
	
}
