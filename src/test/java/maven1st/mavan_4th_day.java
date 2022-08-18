package maven1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavan_4th_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);

	WebElement user=driver.findElement(By.xpath("//input[@name='email']"));
	user.sendKeys("yogesh");
	WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
	pass.sendKeys("yogesh");
	Thread.sleep(5000);
	//WebElement login=driver.findElement(By.xpath("//button[@name=\"login\"]"));
		//login.click();
	//	Thread.sleep(120000);
	WebElement forgot=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
      forgot.click();
	}

}
