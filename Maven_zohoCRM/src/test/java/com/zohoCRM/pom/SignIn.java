package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn {
	@FindBy(id="userName")
	private WebElement unTxtBx;
	
	@FindBy(id="passWord")
	private WebElement pwdTxtBx;
	
	@FindBy(xpath="//input[@title='Sign In']")
	private WebElement signIn;
	
	public SignIn(WebDriver driver){
		PageFactory.initElements(driver, this);
	}

	public WebElement getUnTxtBx() {
		return unTxtBx;
	}

	public WebElement getPwdTxtBx() {
		return pwdTxtBx;
	}

	public WebElement getSignIn() {
		return signIn;
	}
	
	

}
