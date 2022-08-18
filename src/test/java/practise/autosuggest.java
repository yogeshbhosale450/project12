package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class autosuggest {

	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("laptop");
		Thread.sleep(5000);
		List<WebElement> auto=driver.findElements(By.xpath("//li[@class='sbct']/div"));
		int a=auto.size();
System.out.println(a);
          for(int i=0;i<auto.size();i++) {
        	  System.out.println(auto.get(i).getText());
        	  if(auto.get(i).getText().equalsIgnoreCase("laptop price")) {}
        	      auto.get(i).click();
        	      break;
          }
           

	}

}
