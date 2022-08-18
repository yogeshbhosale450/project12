package maven1st;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_12th_day {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/popup.php");
	String parentwindow_ad=	driver.getWindowHandle();
		System.out.println(parentwindow_ad);
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
	Set<String>all=	driver.getWindowHandles();
	Iterator<String>itr=all.iterator();
	
	while(itr.hasNext()) {
		String childwindow_ad=itr.next();
		if(!parentwindow_ad.equals(childwindow_ad)) {
			driver.switchTo().window(childwindow_ad);
                 driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("yogesh");
                 driver.close();
		}
	}
	driver.switchTo().window(parentwindow_ad);
	
	

	}

}
