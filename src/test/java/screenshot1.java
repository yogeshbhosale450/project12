import java.io.File;

import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot1 {

	public static void main(String[] args) throws Exception {

       WebDriverManager.chromedriver().setup();
       WebDriver driver=new ChromeDriver();
       
       driver.get("https://www.amazon.in/");
       driver.manage().window().maximize();
       driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("laptop");
       
       TakesScreenshot ss=(TakesScreenshot) driver;
      File homepage= ss.getScreenshotAs(OutputType.FILE);
       String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\screenshot";
       File destination = new File(location+"//home.png");
       FileUtils.copyFile(homepage, destination);
       
       Thread.sleep(3000);
       driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
       Thread.sleep(5000);
       File nextpage=ss.getScreenshotAs(OutputType.FILE);
       File destination1=new File(location+"//next.png");
       FileUtils.copyFile(nextpage, destination1);
       
       driver.close();

	}

}
