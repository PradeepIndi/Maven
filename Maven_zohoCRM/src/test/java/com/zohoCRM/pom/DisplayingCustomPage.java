package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DisplayingCustomPage {
	@FindBy(xpath="//input[@value='New Campaign']")
	private WebElement newCampaignBtn;
	
	@FindBy(xpath="//input[@value='New Lead']")
	private WebElement newLeadBtn;
	
	public DisplayingCustomPage(WebDriver driver) {
		PageFactory.initElements(driver,this );
	}

	public void setNewCampaignBtn() {
		newCampaignBtn.click();
	}

	public WebElement getNewLeadBtn() {
		return newLeadBtn;
	}
	

}
