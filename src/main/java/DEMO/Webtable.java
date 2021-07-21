package DEMO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();     // selinium all method driver

		driver.get("https://demoqa.com/webtables");
		
		Thread.sleep(3000);
		
		String table = driver.findElement(By.xpath("//*[@class=\"rt-table\"]")).getText();
		
		System.out.print(table);   //print values
		
		
		driver.close();
		


	}

}
