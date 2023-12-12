package common;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestUrls {
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	public void login() throws Exception {
		// Create Driver
		driver = Configuration.createChromeDriver();
		
        driver.get(Configuration.URL_PRODUCTO);
       
	}

	@AfterEach
	public void logout() throws Exception {
		
		driver.quit();
	}

	protected WebDriver getDriver(){
		return this.driver;
	}

	protected WebDriverWait getWaiter(){
		return this.wait;
	}

}
