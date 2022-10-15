package com.zohoCRM.generic;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.zohoCRM.pom.HomePage;
import com.zohoCRM.pom.SignIn;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static {
		WebDriverManager.chromedriver().setup();
		WebDriverManager.firefoxdriver().setup();
	}
	
	
	public static WebDriver driver;
	
	FileLib l=new FileLib();
	
	@BeforeTest
	public void openBrowser() throws IOException {
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		String url=l.getPropertyData("url");
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}
	@BeforeMethod
	public void signIn() throws IOException {
		
		String un = l.getPropertyData("un");
		String pwd=l.getPropertyData("pwd");
		SignIn s=new SignIn(driver);
		s.getUnTxtBx().sendKeys(un);
		s.getPwdTxtBx().sendKeys(pwd);
		s.getSignIn().click();
	}
	@AfterMethod
	public void logOut() {
		HomePage h=new HomePage(driver);
		h.getLogOut().click();
	}
	

}
