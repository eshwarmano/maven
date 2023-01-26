package org.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class DataDriven {

	public static void createexel(String sheetname, int row, int cell, String value) throws IOException {

		File f = new File("C:\\Users\\User\\eclipse-workspace\\BikeInformation\\MAVEN\\Excel\\~$Book1.xlsx");	
		Workbook w = new XSSFWorkbook();
		Sheet s = w.createSheet(sheetname);

		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

		System.out.println("write...");
		
}
	
	public static void createcell(String sheetname, int row, int cell, String value) throws IOException {

		File f = new File("C:\\Users\\User\\eclipse-workspace\\BikeInformation\\MAVEN\\Excel\\~$Book1.xlsx");
		FileInputStream fls=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fls);
		Sheet s = w.getSheet(sheetname);

		Row r = s.getRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

		System.out.println("write...");


}
	
	
	public static void createrow(String sheetname, int row, int cell, String value) throws IOException {

		File f = new File("C:\\Users\\User\\eclipse-workspace\\BikeInformation\\MAVEN\\Excel\\~$Book1.xlsx");
		FileInputStream fls=new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fls);
		Sheet s = w.getSheet(sheetname);

		Row r = s.createRow(row);
		Cell c = r.createCell(cell);
		c.setCellValue(value);

		FileOutputStream fos = new FileOutputStream(f);
		w.write(fos);

		System.out.println("write...");
	
	
	
	
	
	}
	
	public static void exelread(String sheet,int row,int cell) throws IOException {


		File f = new File("C:\\\\Users\\\\User\\\\eclipse-workspace\\\\BikeInformation\\\\MAVEN\\\\Excel\\\\~$Book1.xlsx");
		
		FileInputStream fls = new FileInputStream(f);
		Workbook w = new XSSFWorkbook(fls);
		Sheet s = w.getSheet(sheet);
		Row r = s.getRow(row);
		Cell cell2 = r.getCell(cell);
		
	}
	
	public static WebDriver driver;
	
	private void launch() {
		ChromeDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		



	}
	
	private void url() {



	}
	
	
	
	
}