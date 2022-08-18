package maven1st;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavan_1st_day {
	
	public void amazon() {
    WebDriverManager.chromedriver().setup();
		
		WebDriver Driver=new ChromeDriver();
		
		Driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458706470&hvpos=&hvnetw=g&hvrand=15159200176141170015&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007788&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQjw_viWBhD8ARIsAH1mCd7Y9o65DbvIY9dnGroVEBWo3QihInxMCCtCToU3DLKEXbpI0PToivkaAspZEALw_wcB");
		Driver.manage().window().maximize();
	}
	
	public void fb() {
	WebDriverManager.edgedriver().setup();
	WebDriver z=new EdgeDriver();
	z.get("https://www.facebook.com/");
	
	}
	public static void main(String[] args) {
	
		mavan_1st_day driver=new mavan_1st_day();
		driver.amazon();
		driver.fb();
	
		
		
		

	}

}
