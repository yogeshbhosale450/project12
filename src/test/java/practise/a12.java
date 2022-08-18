package practise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class a12 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		WebElement user= driver.findElement(By.xpath("//input[@id='email']"));
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		
		String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\excel_data\\New Microsoft Excel Worksheet.xlsx";
		
		FileInputStream fis=new FileInputStream(location);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
	String username=	 wb.getSheet("fb_login").getRow(0).getCell(0).getStringCellValue();
		String password=wb.getSheet("fb_login").getRow(0).getCell(1).getStringCellValue();
		System.out.println(username);
		user.sendKeys(username);
		pass.sendKeys(password);
		String path="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\screenshot";
		String rd=RandomString.make(5);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(path+"//"+rd+".png");  
		FileUtils.copyFile(src, dest);
		
		
		
		
		

	}

}
