package org.test;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BaseClass2 extends Insert {
	
	
	public static void main(String[] args) throws IOException {
		
		
		openbrouser();
		geturl("https://www.facebook.com/");
		
	    String s = exelread("Sheet1", 6, 0);
		
		String p = exelread("Sheet1", 7, 0);
		
		
		
		 WebElement email = driver.findElement(By.id("text"));
		passvalue(email, s);
		
		WebElement password = driver.findElement(By.name("passContainer"));
		password(password, p);
		
	}

}
