package common;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest1 {
	protected static WebDriver driver = null;
	
	@BeforeAll
	public static void launchBrowser() throws Exception {
        driver = Configuration.createChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        
        driver.manage().window().maximize();
        
        driver.get(Configuration.ADMIN_URL);
        
        WebElement userTextBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
		userTextBox.sendKeys(Configuration.USER_NAME);
		assertEquals(Configuration.USER_NAME, userTextBox.getAttribute("value"), "Assert the user name text.");
		
		WebElement pwdTextBox = driver.findElement(By.name("password"));
		pwdTextBox.sendKeys(Configuration.PASSWORD);
		assertEquals(Configuration.PASSWORD, pwdTextBox.getAttribute("value"), "Assert the password text.");
		
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and @value='Login']")));
		submitButton.click();
        
	}

	@AfterAll
	public static void closeBrowser() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement logOut = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"));
		driver.get(logOut.getAttribute("href"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Continue')]")));
        driver.quit();		
	}
}
