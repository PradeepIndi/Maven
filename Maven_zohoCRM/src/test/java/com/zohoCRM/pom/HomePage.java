package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath="//a[contains(text(),'Logout')]")
	private WebElement logOut;
	
	@FindBy(xpath="//a[text()='Campaigns']")
	private WebElement campaignsTab;
	
	@FindBy(linkText = "Leads")
	private WebElement leadsTab;
	
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);	
	}

	public WebElement getLogOut() {
		return logOut;
	}

	public WebElement getCampaignsTab() {
		return campaignsTab;
	}

	public WebElement getLeadsTab() {
		return leadsTab;
	}

	

	
	
	

}
