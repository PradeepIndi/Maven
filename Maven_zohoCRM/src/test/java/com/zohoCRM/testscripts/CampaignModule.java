package com.zohoCRM.testscripts;


import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.zohoCRM.generic.BaseClass;
import com.zohoCRM.pom.CampaignDetailsPage;
import com.zohoCRM.pom.CreateCampaignPage;
import com.zohoCRM.pom.DisplayingCustomPage;
import com.zohoCRM.pom.HomePage;

@Listeners(com.zohoCRM.generic.ListenerImplementation.class)

@Test(priority = 0)
public class CampaignModule extends BaseClass {
	
	@Test(priority=1)
	public void createCampaign() {
		HomePage h=new HomePage(driver);
		h.getCampaignsTab().click();
		DisplayingCustomPage d= new DisplayingCustomPage(driver);
		d.setNewCampaignBtn();
		CreateCampaignPage c=new CreateCampaignPage(driver);
		c.getCampNameTbx().sendKeys("Pradeep");
		c.getStrtDateClndrTbx().sendKeys("09/30/2022");
		
		Select s=new Select(c.getTypeList());
		s.selectByVisibleText("Advertisement");
		c.getSaveBtn().click();
		
		CampaignDetailsPage cd=new 	CampaignDetailsPage(driver);
		String actulName = cd.getCreatedCampNameTbx().getText();
		String actulType = cd.getCreatedTypeList().getText();
		Assert.assertEquals(actulName, "Pradeep");
		Assert.assertEquals(actulType, "Advertisement");
		
		
	}
	@Test(priority=2)
	public void ModifyCampaign() {
		
	}
	

}
