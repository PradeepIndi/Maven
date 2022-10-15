package com.zohoCRM.testscripts;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohoCRM.generic.BaseClass;
import com.zohoCRM.generic.FileLib;
import com.zohoCRM.pom.CreateLeadPage;
import com.zohoCRM.pom.DisplayingCustomPage;
import com.zohoCRM.pom.HomePage;
import com.zohoCRM.pom.LeadDetailsPage;
@Listeners(com.zohoCRM.generic.ListenerImplementation.class)
@Test(priority=1)
public class LeadsModule extends BaseClass {
	
	@Test(priority=3)
	public void creteNewLead() throws IOException {
		HomePage h=new HomePage(driver);
		h.getLeadsTab().click();
		DisplayingCustomPage dc=new DisplayingCustomPage(driver);
		dc.getNewLeadBtn().click();
		CreateLeadPage cl=new CreateLeadPage(driver);
		FileLib fl=new FileLib();
		String compName=fl.getExceldata("Lead", 1, 0);
		cl.getCompanyNameTbx().sendKeys(compName);
		String lstName=fl.getExceldata("Lead", 1, 1);
		cl.getLastNameTbx().sendKeys(lstName);
		cl.getSaveBtn().click();
		LeadDetailsPage lp=new LeadDetailsPage(driver);
		String actCmpName=lp.getCompTbx().getText();
		String actLeadName=lp.getLeadTbx().getText();
		
		Assert.assertEquals(actCmpName,compName);
		Assert.assertEquals(actLeadName,lstName);
		
		
	}
	@Test(priority=4)
	public void modifyLead() {

	}
	
	@Test
	public void deleteLead() {
		
	}

}
