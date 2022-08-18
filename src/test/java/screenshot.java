import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class screenshot {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("yogesh");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("yogesh");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(10000);
		TakesScreenshot ss=(TakesScreenshot) driver;
		File login= ss.getScreenshotAs(OutputType.FILE);
		String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\screenshot";
		File destination=new File(location+"//ss.png");
		FileUtils.copyFile(login, destination);
		
		

	}

}
