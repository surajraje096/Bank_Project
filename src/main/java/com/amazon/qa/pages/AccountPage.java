package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class AccountPage extends TestBase{
	
	
	
	public AccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public PotpolioPage AccountPageTitle() {
		System.out.println("Page object MODEL have done all process");
		return new PotpolioPage();
		}
	

	
	
}
