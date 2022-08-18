import java.io.File;
import java.io.FileInputStream;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class full_fb {

	public static void main(String[] args) throws Exception {
		//used for to get chromedriver
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		//used for to open url
		driver.get("https://www.facebook.com/");
		//used to find webelement
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yogesh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yogesh@450");
		driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
     Thread.sleep(5000);
       //dropdown
     WebElement date=driver.findElement(By.xpath("//select[@name='birthday_day']"));
      Select slt=new Select(date);
    // slt.selectByVisibleText("5");
     System.out.println( slt.getOptions().size());
   List<WebElement>list=  slt.getOptions();
     for(int i=0;i<=list.size();i++) {
    	 if(list.get(i).getText().equalsIgnoreCase("31")) {
    		 list.get(i).click();
    		 break;
    	 }
     }
      //move element
     WebElement signup=driver.findElement(By.xpath("(//button[@type='submit'])[2]"));
      Actions act=new Actions(driver);
      act.moveToElement(signup).build().perform();
     
      TakesScreenshot ss=(TakesScreenshot)driver;
      File ss1=ss.getScreenshotAs(OutputType.FILE);
      String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\screenshot";
      File ss2=new File(location+"//page1.png");
      FileUtils.copyFile(ss1, ss2);
      
      
      
      
      
	}

}
