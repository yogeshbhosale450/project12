package practise;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a6 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
            WebDriver driver=new ChromeDriver();
            
            driver.get("https://www.flipkart.com/");
       //     driver.manage().window().maximize();
            
            driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("laptop");
            Thread.sleep(5000);
            
            List<WebElement>list=driver.findElements(By.xpath("//ul[@class='col-12-12 _1MRYA1']/li"));
             System.out.println(list.size());
             
             
//             for(int i=0;i<list.size();i++) {
//            	 if(list.get(i).getText().equalsIgnoreCase("laptop table")) {
//            		 list.get(i).click();
//            		 list.get(i).getText();
//            	 }
//             }
            
            
            
	}

}
