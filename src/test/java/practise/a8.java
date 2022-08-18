package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a8 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("galiyan");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@id='button'])[5]")).click();
		Thread.sleep(3000);
		WebElement history_cursor=driver.findElement(By.xpath("(//a[@id='endpoint'])[6]"));
		Actions act=new Actions(driver);
		act.moveToElement(history_cursor).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
		WebElement country_code=driver.findElement(By.xpath("//select[@name='countryCode']"));
		Select slt=new Select(country_code);
		//slt.selectByVisibleText("IN +91");
		
	List<WebElement>list=slt.getOptions();
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
