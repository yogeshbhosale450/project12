package Test_NG;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class base_class1 {
	
	WebDriver driver;
	
	
	
	@BeforeMethod
	public void BM() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
	}
	@AfterMethod
	public void AM() {
		driver.close();
	}

//	public static void scrollingdown(WebDriver driver,WebElement element) {
//		JavascriptExecutor jse=(JavascriptExecutor)driver;
//		jse.executeScript("arguments[0].scrollIntoView()", element);
//	}
	
	
}
