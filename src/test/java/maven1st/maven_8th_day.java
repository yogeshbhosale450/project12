package maven1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_8th_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//		driver.get("https://www.google.co.in/");
//		
//		WebElement gmail=driver.findElement(By.xpath("//a[text()='Gmail']"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(gmail).click().build().perform();
		
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		//WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		
//		Actions act=new Actions(driver);
//		act.contextClick(rightclick).build().perform();
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//span[text()='Edit']")).click();
//		Thread.sleep(5000);
		
		WebElement double_click=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act1=new Actions(driver);
		act1.doubleClick(double_click).build().perform();
		
		
		
		
		

	}

}
