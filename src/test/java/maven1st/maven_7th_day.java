package maven1st;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_7th_day {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=10959267915529951063&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=Cj0KCQjwxIOXBhCrARIsAL1QFCbC7WLMOdHvDoeKf4I1ho3Yy5i7VSFoULI1ebZJEFcBm7x4Dhvk1oQaAkpXEALw_wcB");
		
		WebElement all=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		s(all,"beauty");
		Select s=new Select(all);
		
		//Select s=new Select(all);
		
		//s.selectByVisibleText("Appliances");
		//Thread.sleep(5000);
		//WebElement search=driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		//search.click();
		
	
		
	
        
       
		
		
		
		
	}

	private static void s(WebElement all, String string) {
		Select s=new Select(all);
		s.selectByVisibleText("beauty");
		
	}

	

}
