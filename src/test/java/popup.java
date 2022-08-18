import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class popup {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/delete_customer.php");
            driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("536");
            driver.findElement(By.xpath("//input[@name='submit']")).click();
            Alert alt=driver.switchTo().alert();
            alt.accept();
            alt.accept();
            
            
            driver.navigate().to("https://demo.guru99.com/popup.php");
            Thread.sleep(5000);
            String parentadd=driver.getWindowHandle();
            driver.findElement(By.xpath("//a[text()='Click Here']")).click();
          Set < String> alladd=driver.getWindowHandles();
          
       Iterator<String> itr =  alladd.iterator();
       
       while(itr.hasNext()) {
    	   String childadd=itr.next();
    	   if(parentadd.equals(childadd)) {
    		   driver.switchTo().window(childadd);
    		   driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("y@gmail.com");
    		   driver.close();
    	   }
       }
       
       
       
       
       
       
            
            
            
            
            
            
            
	}

}
