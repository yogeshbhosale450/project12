package maven1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavan_2nd_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(05000);
		driver.navigate().to("https://twitter.com/i/flow/login");
		Thread.sleep(05000);
		driver.navigate().back();
		Thread.sleep(05000);
		driver.navigate().refresh();
		driver.close();
	}

}
