import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class selectclass {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("laptop");
		Thread.sleep(5000);
	List<WebElement>list=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
	
	System.out.println(	list.size());
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().equalsIgnoreCase("laptop bag")) {
				list.get(i).click();
				break;
			}
		}
		
		driver.navigate().to("https://www.amazon.in/");
		Thread.sleep(10000);
		WebElement all_dropdown=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select slt=new Select(all_dropdown);
		slt.selectByVisibleText("Beauty");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		

	}

}
