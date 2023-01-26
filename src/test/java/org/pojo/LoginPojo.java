package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.BaseClass;

public class LoginPojo extends BaseClass{


public LoginPojo() {
PageFactory.initElements(driver,this);

}

@FindBy(id = "email")
  private WebElement email;

public WebElement getEmail() {
	return email;
}

@FindBy(name = "pass")
 private WebElement password;

public WebElement getPass() {
	return password;
}

@FindBy(id = "login")
private WebElement loginbtn;

public WebElement getPassword() {
	return password;
}

public WebElement getLoginbtn() {
	return loginbtn;
}



}
