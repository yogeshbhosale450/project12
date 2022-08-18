package maven1st;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven1st {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
//
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
		
//		driver.get("https://www.instagram.com/");
//		driver.manage().window().maximize();
//	
//		Thread.sleep(10000);
//		driver.close();
		
	}

}
