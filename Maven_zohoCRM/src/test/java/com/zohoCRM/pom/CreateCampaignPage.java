package com.zohoCRM.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateCampaignPage {
	
	@FindBy(name="property(Campaign Name)")
	private WebElement campNameTbx;
	
	@FindBy(xpath="//img[contains(@onclick,'Start Date')]")
	private WebElement strtDateClndr;
	
	@FindBy(name="property(Start Date)")
	private WebElement strtDateClndrTbx;
	
	@FindBy(name="property(Type)")
	private WebElement typeList;
	
	@FindBy(xpath="//input[@type='submit' and @value='Save']")
	private WebElement saveBtn;
	
	@FindBy(name="Cancel")
	private WebElement cancelBtn;
	
	
	
	public CreateCampaignPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getCampNameTbx() {
		return campNameTbx;
	}


	public WebElement getStrtDateClndr() {
		return strtDateClndr;
	}

	public WebElement getTypeList() {
		return typeList;
	}

	public WebElement getSaveBtn() {
		return saveBtn;
	}

	public WebElement getCancelBtn() {
		return cancelBtn;
	}

	public WebElement getStrtDateClndrTbx() {
		return strtDateClndrTbx;
	}
	
	

}
