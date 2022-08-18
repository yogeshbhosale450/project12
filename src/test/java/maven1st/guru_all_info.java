package maven1st;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class guru_all_info {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		
		WebElement first_name=driver.findElement(By.xpath("//input[@name='firstName']"));
		WebElement last_name=driver.findElement(By.xpath("//input[@name='lastName']"));
		WebElement phone_no=driver.findElement(By.xpath("//input[@name='phone']"));
		WebElement email=driver.findElement(By.xpath("//input[@name='userName']"));
		WebElement address=driver.findElement(By.xpath("//input[@name='address1']"));
		WebElement city=driver.findElement(By.xpath("//input[@name='city']"));
		WebElement state=driver.findElement(By.xpath("//input[@name='state']"));
		WebElement postal_code=driver.findElement(By.xpath("//input[@name='postalCode']"));
		WebElement user_name=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		WebElement confirm_password=driver.findElement(By.xpath("//input[@name='confirmPassword']"));
		
		String location="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\excel_data\\guru signin.xlsx";
		FileInputStream fis=new FileInputStream(location);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		
	String first_name1=	wb.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
	String last_name1=wb.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
	String phone_no1=wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
	String email1=wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
	String address1=wb.getSheet("Sheet1").getRow(1).getCell(4).getStringCellValue();
	String city1=wb.getSheet("Sheet1").getRow(1).getCell(5).getStringCellValue();
	String state1=wb.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
	String postal_code1=wb.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
	String user_name1=wb.getSheet("Sheet1").getRow(1).getCell(8).getStringCellValue();
	String password1=wb.getSheet("Sheet1").getRow(1).getCell(9).getStringCellValue();
	String confirm_password1=wb.getSheet("Sheet1").getRow(1).getCell(10).getStringCellValue();
	
	first_name.sendKeys(first_name1);
	last_name.sendKeys(last_name1);
	phone_no.sendKeys(phone_no1);
	email.sendKeys(email1);
	Thread.sleep(4000);
	address.sendKeys(address1);
	city.sendKeys(city1);
	state.sendKeys(state1);
	postal_code.sendKeys(postal_code1);
	Thread.sleep(3000);
	
	WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
	Select slt=new Select(country);
	slt.selectByVisibleText("INDIA");
	
	
	Thread.sleep(3000);
	user_name.sendKeys(user_name1);
	password.sendKeys(password1);
	confirm_password.sendKeys(confirm_password1);
	
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		Thread.sleep(3000);
		
	String txt=	driver.findElement(By.xpath("//table[@width='492']")).getText();
		System.out.println("Result_1 :" +txt);
		TakesScreenshot ts=(TakesScreenshot) driver;
		File ss=ts.getScreenshotAs(OutputType.FILE);
		String path="C:\\Users\\YOGESH\\eclipse-workspace\\1st_day\\screenshot";
         File ss1=new File(path+"//1st_img.png");
         FileUtils.copyFile(ss, ss1);
         
         driver.findElement(By.xpath("//a[@href='login.php']")).click();
         Thread.sleep(4000);
         
         WebElement user=driver.findElement(By.xpath("//input[@name='userName']"));
         WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
         
         user.sendKeys(user_name1);
         pass.sendKeys(password1);
         Thread.sleep(2000);
         driver.findElement(By.xpath("//input[@name='submit']")).click();
         Thread.sleep(2000);
         
         String txt1=driver.findElement(By.xpath("//table[@width='492']")).getText();
         System.out.println("Result_2 :" +txt1);
       Thread.sleep(2000);
         driver.close();
         
         
         
	}

}
