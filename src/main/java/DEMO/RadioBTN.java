package DEMO;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioBTN {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // selinium all method driver

		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     // implicitlywait  

		driver.manage().window().maximize(); // window maximized
		
		List<WebElement> Webelemt =driver.findElements(By.xpath("//*[@class=\"custom-control-label\"]"));  // 1 of 2   // 0 index
		
		Webelemt.get(0).click();

		
		driver.findElement(By.xpath(""));    // perticular one web element  1) return Webelement  2) one and only one webelement
		
		driver.findElements(By.xpath(""));   // multiple web element    1)  retun type List   2) it should be dublicated
		
		
		
		
		
	}

}
