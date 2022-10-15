package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadPage {
	@FindBy(name = "property(Company)")
	private WebElement companyNameTbx;
	
	@FindBy(name = "property(Last Name)")
	private WebElement lastNameTbx;
	
	@FindBy(xpath="//input[@value='Save']")
	private WebElement saveBtn;
	
	public CreateLeadPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getCompanyNameTbx() {
		return companyNameTbx;
	}

	public WebElement getLastNameTbx() {
		return lastNameTbx;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	

}
