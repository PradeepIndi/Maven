package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadDetailsPage {
	@FindBy(xpath = "//td[@id='Company']/../td[4]")
	private WebElement compTbx;
	
	@FindBy(xpath = "//td[@id='Last Name']/../td[4]")
	private WebElement leadTbx;
	
	public LeadDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCompTbx() {
		return compTbx;
	}

	public WebElement getLeadTbx() {
		return leadTbx;
	}
	
	

}
