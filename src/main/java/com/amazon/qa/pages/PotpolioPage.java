package com.amazon.qa.pages;

import org.openqa.selenium.support.PageFactory;

import com.amazon.qa.base.TestBase;

public class PotpolioPage extends TestBase{

	public PotpolioPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public  PotpolioPageTitle() {
		System.out.println("Page object MODEL have done Portpoli metod");
		}
	
	
	
}
