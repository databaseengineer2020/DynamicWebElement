package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebelement {
	
	WebDriver driver;
	
	@Before
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.cnn.com/");
		//driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	public void dealWithDynamicWebElements() {
		//tried all this three dynamic elements for CNN news.
		//driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-1 cn-container_EE16341D-2F9F-5461-C833-20CB10D8594E']/descendant::span[2]")).click();
		//driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-1 cn-container_5EFE7E38-CEE6-D57A-086A-186AE74669A8']/descendant::span[2]")).click();
		driver.findElement(By.xpath("//ul[@class='cn cn-list-hierarchical-xs cn--idx-5 cn-coverageContainer_8C4FF4C7-3E30-1ABB-5B13-C072E64EDA38 cn--has-shingle']/descendant::span[1]")).click();
		
		//Tried when there is no attributes inside XML element (dynamic Element)
		//driver.findElement(By.xpath("//form[@class='login']/descendant::input[2]")).sendKeys("abc123");
	}

}
