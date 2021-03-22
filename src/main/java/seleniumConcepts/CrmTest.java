package seleniumConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CrmTest {
	
	WebDriver driver;
	
	@Before
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=login/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@Test
	public void loginTest() {
		
		//Storing Web Element
		/*WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
		WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
		WebElement DASHBOARD_FIELD_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),' Dashboard ')]"));*/
		
				
		/*USERNAME_FIELD_ELEMENT.clear();
		USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
		PASSWORD_FIELD_ELEMENT.clear();
		PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
		SIGNIN_BUTTON_ELEMENT.click();*/
		
		
		try {
			//Storing Web Element
			WebElement USERNAME_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='username']"));
			WebElement PASSWORD_FIELD_ELEMENT = driver.findElement(By.xpath("//input[@id='password']"));
			WebElement SIGNIN_BUTTON_ELEMENT = driver.findElement(By.xpath("//button[@name='login']"));
			//WebElement DASHBOARD_FIELD_ELEMENT = driver.findElement(By.xpath("//h2[contains(text(),'Dashboard')]"));
			
			USERNAME_FIELD_ELEMENT.clear();
			USERNAME_FIELD_ELEMENT.sendKeys("demo@techfios.com");
			PASSWORD_FIELD_ELEMENT.clear();
			PASSWORD_FIELD_ELEMENT.sendKeys("abc123");
			SIGNIN_BUTTON_ELEMENT.click();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		//Storing Web Element using (By Class)
		/*By USERNAME_FIELD_LOCATOR = (By.xpath("//input[@id='username']"));
		By PASSWORD_FIELD_LOCATOR = (By.xpath("//input[@id='password']"));
		By SIGNIN_BUTTON_LOCATOR = (By.xpath("//button[@name='login']"));
		By DASHBOARD_FIELD_LOCATOR = (By.xpath("//h2[contains(text(),'Dashboard')]"));
					
		driver.findElement(USERNAME_FIELD_LOCATOR).sendKeys("demo@techfios.com");
		driver.findElement(PASSWORD_FIELD_LOCATOR).sendKeys("abc123");
		driver.findElement(SIGNIN_BUTTON_LOCATOR).click();*/
		
		
	}

}
