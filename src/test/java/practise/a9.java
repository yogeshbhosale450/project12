package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a9 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[@role='button']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("(//span[@class='css-901oao css-16my406 css-1hf3ou5 r-poiln3 r-a023e6 r-rjixqe r-bcqeeo r-qvutc0'])[3]")).click();
		
		WebElement first_name=driver.findElement(By.xpath("//input[@name='name']"));
          Actions act=new Actions(driver);
		act.sendKeys("YOGESH").build().perform();
		act.sendKeys(Keys.TAB).sendKeys("757604").build().perform();
		
		WebElement month=driver.findElement(By.xpath("(//select[@class='r-30o5oe r-1niwhzg r-17gur6a r-1yadl64 r-18jsvk2 r-1loqt21 r-37j5jr r-1inkyih r-rjixqe r-crgep1 r-1wzrnnt r-1ny4l3l r-t60dpp r-xd6kpl r-1pn2ns4 r-ttdzmv'])[1]"));
		Select slt=new Select(month);
		List<WebElement>list=slt.getOptions();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("december")) {
				list.get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
