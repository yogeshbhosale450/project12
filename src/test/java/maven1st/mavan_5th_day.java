package maven1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavan_5th_day {

	public static void main(String[] args) {

       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
        
       driver.get("https://www.facebook.com/login.php/");
  WebElement btn_signup = driver.findElement(By.xpath("//a[text()='Sign up for Facebook' ]"));
      btn_signup.click();
      WebElement first_name = driver.findElement(By.xpath("(//input[@data-type='text'])[1]"));
      first_name.sendKeys("yogesh");
      WebElement surname= driver.findElement(By.xpath("(//input[@data-type='text'])[2]"));
      surname.sendKeys("bhosale");
      WebElement no= driver.findElement(By.xpath("(//input[@data-type='text'])[3]"));
      no.sendKeys("7276040828");
      WebElement password=driver.findElement(By.name("reg_passwd__"));
      password.sendKeys("yogesh@45456789");
      
      
	}

}
