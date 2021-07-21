package com.amazon.qa.base;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.Test;

public class Demo {
	
	
	@Test
	public void show() throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://ssgqa.serviceurl.in/gonogo-fbl-cc/#/entry");
		
		String expected="Federal Bank Credit Card";    // url not title
		String actual = driver.getTitle();
		
		assertEquals(actual, expected);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*		driver.findElement(By.xpath("/html/body/app-root/app-entry-form/section/div/div[1]/div/div[2]/div[1]/div/input")).sendKeys("7356931916");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@formcontrolname='consentInput']")).click();   // btn click
		
		driver.findElement(By.xpath("//span[text()=' Request OTP ']")).click();
		
		Thread.sleep(5000);
		
	String otp = driver.findElement(By.xpath("//*[@id=\"toast-container\"]")).getText();
	
	System.out.println(otp);
		
	String st2=otp.replaceAll("[^0-9]", "");
	
	System.out.println(st2);
	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[@formcontrolname='otpFieldInput']")).sendKeys(st2);
	
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//span[text()=' Verify OTP ']")).click();
	
	Thread.sleep(3000);
	*/
	
		
		
		
		
	}

}
