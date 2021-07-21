package DEMO;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Textbox {
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // selinium all method driver

		driver.get("https://demoqa.com/text-box");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     // implicitlywait  
		
		// 1) global wait 
		// 2) applicable for all web element 
		

		driver.manage().window().maximize(); // window maximized

		driver.findElement(By.xpath("//*[@id=\"userName\"]")).sendKeys("suraj s patil");  //1
		
		// 3 second stop
		
		
		
		Thread.sleep(5000);   // hard wait 
		
		
		
		

		driver.findElement(By.id("userEmail")).sendKeys("surajraje096@gmail.com");//2

		driver.findElement(By.id("currentAddress")).sendKeys("pune");//3

		driver.findElement(By.id("permanentAddress")).sendKeys("pune kolhapur");//4

	//	driver.findElement(By.id("submit")).click();//5

		driver.close();

	
	}

}
