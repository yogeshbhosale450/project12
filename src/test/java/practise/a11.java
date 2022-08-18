package practise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class a11 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		WebElement search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\excel_data\\New Microsoft Excel Worksheet.xlsx";
		FileInputStream fis=new FileInputStream(location);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
		String search1=wb.getSheet("fb_login").getRow(1).getCell(0).getStringCellValue();
		search.sendKeys(search1);
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(10000);
		WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
		
		String location1="C:\\Users\\YOGESH\\Desktop\\songs";
		
		FileInputStream fis1=new FileInputStream(location1);
		XSSFWorkbook wb1=new XSSFWorkbook(fis1);
		
		String user=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		username.sendKeys(user);
		
		

	}

}
