package maven1st;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mavan_6th_day {

	public static void main(String[] args) throws Exception {
	 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
      driver.get("https://www.google.co.in/?pccc=1");
      WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
      search.sendKeys("dell");
      Thread.sleep(5000);
		List<WebElement> list=driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));
		System.out.println(list.size());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equals("dell laptop price")) {
				list.get(i).click();
				break;
			}
		}
			
				
			
		
		
	}

}
