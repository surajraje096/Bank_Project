/**
 * 
 */
package com.amazon.qa.pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.amazon.qa.actiondriver.Action;
import com.amazon.qa.base.TestBase;

public class LoginPage extends TestBase   {
	
	


	String st1;
	
	
	@FindBy(xpath = "(//input[contains(@class,'ng-untouched ng-pristine')])[2]")      
	WebElement Mobile_text;

	@FindBy(xpath = "//input[@formcontrolname='consentInput']")
	WebElement Radio_btn;

	@FindBy(xpath = "//span[text()=' Request OTP ']")
	WebElement RequestOTP_btn;

	@FindBy(xpath = "//*[@id=\\\"toast-container\\\"]")
	WebElement getotp;

	@FindBy(xpath = "//input[@formcontrolname='otpFieldInput']")
	WebElement Enterotp;
	
	@FindBy(xpath = "//span[text()=' Verify OTP ']")
	WebElement VeriftotpBTN;
	
	
	
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	
	
	
	
	
	public void valid_title() {
		String actual_title = driver.getTitle();
		System.out.println(actual_title);
	}
	
	


	public void Enter_Mobile_Number() throws InterruptedException {
		Thread.sleep(3000);
		Mobile_text.sendKeys(prop.getProperty("MobileNumber1"));
	}

	public void Click_radioBTN() {
		Radio_btn.click();
	}

	public void Click_RequestOTP() throws InterruptedException {
		RequestOTP_btn.click();
		Thread.sleep(9000);
	}

	public void Get_OTP() throws InterruptedException {
		String otp = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();

		System.out.println(otp);
			
		String st2=otp.replaceAll("[^0-9]", "");
		
		System.out.println(st2);
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='otpFieldInput']")).sendKeys(st2);
		
		Thread.sleep(3000);
	}
	
	
	
	public HomePage Verify_OTPBTN() throws InterruptedException {
		VeriftotpBTN.click();
		Thread.sleep(5000);
		return new HomePage();
	}
		
	
	
}
