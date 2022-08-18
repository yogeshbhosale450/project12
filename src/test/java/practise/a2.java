package practise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();;
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/b?node=27063338031&pf_rd_r=HJ5Z9EJM2YE20AW0263H&pf_rd_p=4159da0a-35f5-4fcb-8d73-86611a288072&pd_rd_r=384e1eb5-c5bc-4cb3-8c1b-2d888a204109&pd_rd_w=QN0Is&pd_rd_wg=dzrgK&ref_=pd_gw_unk");
		WebElement signin=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
		signin.click();
		Thread.sleep(05000);
		WebElement create=driver.findElement(By.xpath("//a[@id='createAccountSubmit']"));
		create.click();
		WebElement name=driver.findElement(By.id("ap_customer_name"));
		name.sendKeys("yogesh bhosale");
		WebElement email=driver.findElement(By.xpath("//input[@id='ap_email']"));
		email.sendKeys("yogesh@gmail.com");
      Thread.sleep(5000);
      driver.close();
	}

}
