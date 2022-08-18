package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a1 {

	public static void main(String[] args) throws Exception {
		//we get/import chrome in webdrivermanager.
		WebDriverManager.chromedriver().setup();
		//we create object with used of inteface(WebDriver) reference variable driver.
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		//	driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		driver.manage().window().maximize();
		
		WebElement create_btn=driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		create_btn.click();
		Thread.sleep(5000);
		
	WebElement first_name=driver.findElement(By.xpath("//input[@name='firstname']"));
	first_name.sendKeys("yogesh");
	
	WebElement surname=driver.findElement(By.name("lastname"));
	surname.sendKeys("bhosale");
	Thread.sleep(2000);
	WebElement email=driver.findElement(By.xpath("//input[@name='reg_email__']"));
	email.sendKeys("yogesh@450");
	
	WebElement pass=driver.findElement(By.xpath("//input[@id='password_step_input']"));
	pass.sendKeys("yogesh@450");
	Thread.sleep(5000);
	
	driver.close();
	
	
		
		

	}

}
