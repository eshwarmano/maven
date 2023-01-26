package org.test;

import java.io.File;
import java.io.IOException;
import java.sql.Driver;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;

public class BaseClass {
	public static WebDriver driver;
	
	
	public static void openbrouser() {
		ChromeDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

	}
	
	public static void geturl(String url) {
		driver.get(url);
		
	}
	
	public static void gettitle() {
		String t = driver.getTitle();
		System.out.println("title: "+t);

	}
	
	public static void getcurrenturl() {
		String c = driver.getCurrentUrl();
		System.out.println("currenturl : "+c);

	}
	
	public static void findelement(WebElement e , String s) {
		e.sendKeys(s);
		

	}
	
	public static void password(WebElement w , String g) {
		w.sendKeys(g);
		

	}
	
	public static void click(WebElement e) {
		e.click();
		

	}
	
	public static void screenshot( String filename) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\User\\eclipse-workspace\\BikeInformation\\MAVEN\\Screenshot\\screenshot\\"+filename+".png");
		FileUtils.copyFile(src, dest);
		

	}
	
	private void script(String a , Object o ) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript(a, o);
		
		

	}
	
	
	public void closebrouser() {
	driver.close();

	}
	
	
	
	
	
	
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	


	
	
	
	
	
	


