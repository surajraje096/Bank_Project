package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();     // selinium all method driver

		driver.get("https://ssgqa.serviceurl.in/gonogo/");
		
		
		driver.findElement(By.xpath("//*[@class=\"ng-valid ng-dirty ng-valid-parse ng-touched ng-empty\"]")).click();

	
		Thread.sleep(90000);
		
		
		driver.close();
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
