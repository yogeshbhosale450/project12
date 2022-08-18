package maven1st;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class maven_10th_day {

	public static void main(String[] args) throws Exception {

     WebDriverManager.chromedriver().setup();
     WebDriver driver=new ChromeDriver();
     
		
     driver.get("https://www.facebook.com/");
      
     WebElement username=driver.findElement(By.xpath("//input[@id='email']"));
     WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
     
     String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\excel_data\\New Microsoft Excel Worksheet.xlsx";
     
     FileInputStream fis=new FileInputStream(location);
     XSSFWorkbook wb=new XSSFWorkbook(fis); 
     
    String data1= wb.getSheet("fb_login").getRow(0).getCell(0).getStringCellValue();
     String data2=wb.getSheet("fb_login").getRow(0).getCell(1).getStringCellValue();
      
   // System.out.println(data2);
   //username.sendKeys(data1);
     pass.sendKeys(data2);
     
     //driver.findElement(By.xpath("//button[@name='login']")).click();
     
   double data3=wb.getSheet("fb_login").getRow(0).getCell(3).getNumericCellValue();
     
   //System.out.println(data3);
     String data3_1=String.valueOf(data3);
      String user=    data3_1.replace(".0", "");
     username.sendKeys(user);
     
	}

}
