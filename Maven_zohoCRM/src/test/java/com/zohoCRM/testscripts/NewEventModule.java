package com.zohoCRM.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohoCRM.generic.BaseClass;

@Listeners(com.zohoCRM.generic.ListenerImplementation.class)

public class NewEventModule extends BaseClass {
	@Test(priority = 1)
	public void createNewEvent() {
		
	}
	
	@Test
	public void editEvent() {
		
	}

}
