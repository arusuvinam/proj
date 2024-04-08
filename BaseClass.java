package org.proj;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public  static WebDriver driver;
	
	public static  void openChrome() {
		
		WebDriverManager.chromedriver().setup();
	     driver=new ChromeDriver();
	     //driver.get("https://www.naukri.com/");

	

	}
	
	public static void maxWindow() {
		driver.manage().window().maximize();
		}
	public static void closeBrowser() {
		driver.quit();

	}
	
	public static String pageTitle() {
	
		String title = driver.getTitle();
		return title;

	}
	public static  String pageUrl() {
	String Url = driver.getCurrentUrl();
	return Url;

	
}
	public static  void openWebpage( String Url) {
		driver.get(Url);

	}
	public static  void clicking(WebElement ref) {
		ref.click();
		

	}
	public static  void sending(WebElement ref,String Val) {
		ref.sendKeys(Val);
	

	}

	public  static String getExel( String ExName,String ShName ,int RawInd,int CellInd) throws IOException {
		File f= new File("C:\\Users\\Arunima\\eclipse-workspace1\\Frame1\\"+ExName+"\\aru.xlsx");
		FileInputStream fi= new FileInputStream(f);
		Workbook book= new XSSFWorkbook(fi);
		
				Sheet sh = book.getSheet(ShName);
				Row r = sh.getRow(RawInd);
				Cell c = r.getCell(CellInd);
			
				
				String s ;
				 if (c.getCellType()==1) {
					 
					 s= c.getStringCellValue();
					 
					
				} else if (DateUtil.isCellDateFormatted(c)) {
					
		Date d = c.getDateCellValue();
					SimpleDateFormat si=new SimpleDateFormat("dd/MMM/yyyy");
					 s = si.format(d);
				
					
				
				} else {
					
					double d = c.getNumericCellValue();
					long l=(long)d;
			 s = String.valueOf(l);
					
					
					

				}
				 return s;
				 
				 
					
				 

				}}

	
	
		
	


