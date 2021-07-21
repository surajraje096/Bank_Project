package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class HomePage extends TestBase{
	
	
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}


	public AccountPage HomePageTitle() {
		System.out.println("Page object MODEL WORKING FINE");
		return new AccountPage();
		}
	

}
