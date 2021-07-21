
package com.wordpress.qa.testcases;

import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;

import com.amazon.qa.base.TestBase;
import com.amazon.qa.pages.AccountPage;
import com.amazon.qa.pages.HomePage;
import com.amazon.qa.pages.LoginPage;
import com.amazon.qa.pages.PotpolioPage;

public class LoginPageTest extends TestBase {

	LoginPage LoginPag;
	HomePage HomePag;
	AccountPage AccountPag;
	PotpolioPage PotpolioPag;

	@BeforeMethod // befor test excute
	public void setup() {

		initialization();

		app_logs.debug("LONCH BROWSER SURAJ ");
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

	@Test()
	public void loginTest() throws Throwable {

		LoginPag = new LoginPage(); // object create veriable use krun method call

		LoginPag.valid_title();
		LoginPag.Enter_Mobile_Number();
		LoginPag.Click_radioBTN();
		LoginPag.Click_RequestOTP();
		LoginPag.Get_OTP();
		HomePag=LoginPag.Verify_OTPBTN();
		AccountPag=HomePag.HomePageTitle();
		PotpolioPag=AccountPag.AccountPageTitle();
		
		
		
		/*
		 * HomePage sp = new HomePage(); sp.HomePageTitle();
		 * 
		 * AccountPage sk = new AccountPage(); sk.AccountPageTitle();
		 */

	}

}
