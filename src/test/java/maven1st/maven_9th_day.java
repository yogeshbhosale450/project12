package maven1st;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_9th_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
	WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		Actions act=new Actions(driver);
		act.keyDown(username, Keys.SHIFT).sendKeys("yogesh").keyUp(Keys.SHIFT).build().perform();
        
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).keyDown(Keys.CONTROL).sendKeys("c").build().perform();
		
		driver.findElement(By.xpath("//input[@id='pass']")).click();
		
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
	
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement a=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement b=driver.findElement(By.xpath("(//li[@class=\"placeholder\"])[1]"));
		 
		act.dragAndDrop(a, b).build().perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
