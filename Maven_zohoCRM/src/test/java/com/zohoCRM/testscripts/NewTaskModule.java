package com.zohoCRM.testscripts;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.zohoCRM.generic.BaseClass;
@Listeners(com.zohoCRM.generic.ListenerImplementation.class)
public class NewTaskModule extends BaseClass{
	
	@Test
	public void createTask() {
		
	}

}
