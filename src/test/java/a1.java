import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
            
	//	driver.get("https://www.amazon.in/");
		//driver.findElement(By.cssSelector("[id=\"twotabsearchtextbox\"]")).sendKeys("laptop");
		
		//driver.get("https://www.facebook.com/");
	//	driver.findElement(By.partialLinkText("Forgotten pas")).click();
		
//		driver.get("https://www.google.co.in/");
//		WebElement gmail=driver.findElement(By.linkText("Gmail"));
//		Actions act=new Actions(driver);
//		act.moveToElement(gmail).build().perform();
		
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		WebElement src=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement destination=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions act=new Actions(driver);
		act.dragAndDrop(src, destination).build().perform();
		
		
		
		
	}

}
