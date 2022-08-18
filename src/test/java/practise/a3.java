package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a3 {

	public static void main(String[] args) throws Exception {
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_nxqtetlae_e&adgrpid=60571832564&hvpone=&hvptwo=&hvadid=486387378181&hvpos=&hvnetw=g&hvrand=10959267915529951063&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-296458789801&hydadcr=14452_2154371&gclid=Cj0KCQjwxIOXBhCrARIsAL1QFCbC7WLMOdHvDoeKf4I1ho3Yy5i7VSFoULI1ebZJEFcBm7x4Dhvk1oQaAkpXEALw_wcB");
		WebElement search=driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("laptop");
		
		Thread.sleep(5000);
		
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("laptop bag for men")) {
				list.get(i).click();
				break;
			}
		}
		
		

	}

}
