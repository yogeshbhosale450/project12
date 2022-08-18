import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class action {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement single_click= driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions act=new Actions(driver);
//		act.contextClick(single_click).build().perform();
	WebElement double_click=	driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
act.doubleClick(double_click).build().perform();
 Alert al=driver.switchTo().alert();
 al.accept();


	}

}
