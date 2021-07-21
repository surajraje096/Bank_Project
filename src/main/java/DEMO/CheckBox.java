package DEMO;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();     // selinium all method driver

		driver.get("https://demoqa.com/checkbox");

		
	/*	List<WebElement> Webelemt =driver.findElements(By.xpath("//*[@id=\"item-1\"]/span"));
				
		Webelemt.get(0).click();*/
		
		Thread.sleep(4000);
		
		List<WebElement> Webelemt1 =driver.findElements(By.xpath("//*[@class=\"rct-icon rct-icon-uncheck\"]"));
		
		Webelemt1.get(0).click();
		

		System.out.println("all functinality working properly");
	
		
		
	}

}
