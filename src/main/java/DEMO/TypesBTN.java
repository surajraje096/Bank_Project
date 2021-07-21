package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TypesBTN {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();     // selinium all method driver

		driver.get("https://demoqa.com/buttons");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
//==================================================================================================================
		Actions actions = new Actions(driver);     // object create
		
		WebElement elementLocator = driver.findElement(By.id("doubleClickBtn"));  //stoar one value in webelement
		
		actions.doubleClick(elementLocator).perform();
		
		System.out.println("Double click Done");
		
//==================================================================================================================
		
		
		WebElement link = driver.findElement(By.id("rightClickBtn"));
		
		actions.contextClick(link).perform();
		
		System.out.println("Right click Done");
		
		
//==================================================================================================================		
	
		
		
	}

}
