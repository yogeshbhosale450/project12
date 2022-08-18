package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a4 {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement dd_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select slt=new Select(dd_country);
//		slt.selectByIndex(5);
//		Thread.sleep(5000);
//		slt.selectByValue("ARUBA");
//		Thread.sleep(5000);
//		slt.selectByVisibleText("BANGLADESH");
		List<WebElement>list=slt.getOptions();
		System.out.println(list.size());
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getText().equalsIgnoreCase("bangladesh")) {
				list.get(i).click();
				break;
			}
		}
			
		
		
		
	
		
		
		
		

	}

}
