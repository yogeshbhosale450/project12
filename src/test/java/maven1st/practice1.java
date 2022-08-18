package maven1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class practice1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://twitter.com/i/flow/login");
		
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.navigate().to("https://twitter.com/i/flow/password_reset?input_flow_data=%7B%22requested_variant%22%3A%22eyJwbGF0Zm9ybSI6IlJ3ZWIifQ%3D%3D%22%7D");
		Thread.sleep(5000);
		driver.get("https://www.facebook.com/login/");
		
		
		
		
		
		
	}

}
