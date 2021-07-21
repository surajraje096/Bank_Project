package DEMO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\JARs\\chromeSelinium\\Chrom91\\chromedriver.exe");

		WebDriver driver = new ChromeDriver(); // selinium all method driver

		driver.get("https://demoqa.com/radio-button");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);     // implicitlywait  

		driver.manage().window().maximize(); // window maximized

	}

}
