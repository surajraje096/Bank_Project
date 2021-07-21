package DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ifametest {

	public static void main(String[] args) {
		
				
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); 

		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_form_submit");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);      

		driver.manage().window().maximize(); 
		
		
	//	driver.switchTo().frame("iframeResult");   // by name
		
	//	driver.switchTo().frame("1");   // index value
		
	//	driver.switchTo().frame(driver.findElement(By.xpath("//*[@id=\"iframeResult\"]"))); // by webelement
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).clear();
		
		driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("suraj patil");
		
		
		
		
		
		
		
		
		
		
		
		
		//driver.switchTo().frame(1);
		
	//	driver.findElement(By.xpath("//*[@id=\"fname\"]")).sendKeys("suraj");
		
		
		
		
		
		
		

	}

}
