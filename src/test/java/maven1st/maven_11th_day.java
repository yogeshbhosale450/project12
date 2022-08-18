package maven1st;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_11th_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("101");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
	Alert submit=	driver.switchTo().alert();
	System.out.println(submit.getText());
		submit.accept();
		Thread.sleep(3000);
		submit.accept();

	}

}
