package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a5 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
     driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
     Thread.sleep(2000);
     
     driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("anup");
     driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("more");
     driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("7274082");
     driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("450450");
     
     WebElement day=driver.findElement(By.xpath("//select[@name='birthday_day']"));
		Select slt=new Select(day);
		slt.selectByVisibleText("20");
		
	WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select slt1=new Select(month);
		slt1.selectByVisibleText("Sep");
		
	WebElement year=driver.findElement(By.xpath("//select[@name='birthday_year']"));
		Select slt2=new Select(year);
		slt2.selectByVisibleText("1997");

	   driver.findElement(By.xpath("(//label[@class='_58mt'])[2]")).click();	
	   Thread.sleep(5000);
	   
	   driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
		
		

	}

}
