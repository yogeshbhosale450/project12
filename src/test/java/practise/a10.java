package practise;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a10 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		TakesScreenshot ss=(TakesScreenshot) driver;
		File fb=ss.getScreenshotAs(OutputType.FILE);
		String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\screenshot";
		File destination=new File(location+"//photo.png");
		FileUtils.copyFile(fb, destination);

	}

}
