package org.pojo;

import org.openqa.selenium.WebElement;
import org.test.BaseClass;

public class BrouserLaunch extends BaseClass {
	
	public static void main(String[] args) {
		
		openbrouser();
		geturl("https://www.facebook.com/");
		 
		LoginPojo l = new LoginPojo();
		WebElement email = l.getEmail();
		findelement(email, "eshwar");
		
		LoginPojo l1=new LoginPojo();
		
		WebElement password = l1.getPass();
		password(password, "sakthi");
		
	WebElement btn = l.getLoginbtn();
	click(btn);
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	

}
