package maven1st;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavan_3rd_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=10959267915529951063&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=Cj0KCQjwxIOXBhCrARIsAL1QFCbC7WLMOdHvDoeKf4I1ho3Yy5i7VSFoULI1ebZJEFcBm7x4Dhvk1oQaAkpXEALw_wcB");	
//	driver.manage().window().maximize();
//	Thread.sleep(5000);
//	WebElement txt_search=driver.findElement(By.id("twotabsearchtextbox"));
//	txt_search.sendKeys("dell laptop");
//	WebElement button_search=driver.findElement(By.id("nav-search-submit-button"));
//	button_search.click();
//	Thread.sleep(5000);
//	driver.close();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement username=driver.findElement(By.name("email"));
		username.sendKeys("yogeshbhosle@gmail.com");
		WebElement password=driver.findElement(By.id("pass"));
		password.sendKeys("yysb@110");
		Thread.sleep(5000);
		WebElement login_button=driver.findElement(By.name("login"));
		login_button.click();
		Thread.sleep(20000);
		driver.close();
		
		

	}

}
