package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a7 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand=17103150808188124643&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040229&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjwuaiXBhCCARIsAKZLt3kB5TqWcI92HWRJKD0up2JIqg2j2n_6aho1wJ3uIuwbZvVp6V1jGykaAg8vEALw_wcB");
	Thread.sleep(2000);
	
	WebElement all_db=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
	Select slt=new Select(all_db);
	//slt.selectByIndex(6);
	List<WebElement>list=slt.getOptions();
	  list.get(5).click();
	Thread.sleep(2000);
	
	  driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//i[@class='a-icon a-icon-checkbox'])[3]")).click();
		Thread.sleep(5000);
		
		WebElement devices=driver.findElement(By.xpath("//span[text()='Health Care Devices']"));
		Actions act=new Actions(driver);
		act.moveToElement(devices).build().perform();
		Thread.sleep(3000);
		
		
		driver.navigate().to("https://www.instagram.com/");
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='Instagram Lite']")).click();
		Thread.sleep(4000);
		driver.navigate().back();
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("yogesh");
		Thread.sleep(5000);
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		Thread.sleep(6000);
		WebElement single_click=driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions act1=new Actions(driver);
		act1.contextClick(single_click).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().back();
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.close();
		
		
		
		
		
		

	}

}
