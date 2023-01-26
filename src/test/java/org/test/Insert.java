package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

import com.fasterxml.jackson.annotation.JacksonInject.Value;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Insert {
	  

public static WebDriver driver;
  
public static void openbrouser() {
    WebDriverManager.chromedriver().setup(); 
    driver=new ChromeDriver();
    }
public static void geturl(String url) {
	driver.get(url);
	}	
public static void passvalue(WebElement e,String s){	
	e.sendKeys(s);
	}	
public static void password(WebElement w , String p) {	
	w.sendKeys(p);
	}
		
				
public static String exelread(String sheetname,int row,int cell) throws IOException {
	

	File f = new File("C:\\Users\\User\\eclipse-workspace\\BikeInformation\\MAVEN\\Excel\\Book1.xlsx");
	
	FileInputStream fls = new FileInputStream(f);
	
	Workbook w = new XSSFWorkbook(fls);
	
	Sheet s = w.getSheet(sheetname);
	
    Row r = s.getRow(row);
    
    Cell cell2 = r.getCell(cell);
	return sheetname;
	
	
	
	
	
}
	
			
		}
		
		
		
		
		
		
	


