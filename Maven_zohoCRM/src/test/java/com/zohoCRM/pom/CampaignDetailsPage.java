package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CampaignDetailsPage {
	@FindBy(id="value_Campaign Name")
	private WebElement createdCampNameTbx;
	
	@FindBy(id="value_Type")
	private WebElement createdTypeList;
	
	public CampaignDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public WebElement getCreatedCampNameTbx() {
		return createdCampNameTbx;
	}

	public WebElement getCreatedTypeList() {
		return createdTypeList;
	}
}
