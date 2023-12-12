package common;

import java.time.Duration;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest2_old {
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;

	@BeforeEach
	public void login() throws Exception {
		// Create Driver
		driver = Configuration.createChromeDriver();
		//wait = new WebDriverWait(driver, 10);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		

		// Login
		driver.get(Configuration.ADMIN_URL);
        WebElement userTextBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("email")));
        userTextBox.sendKeys(Configuration.USER_NAME);
        WebElement pwdTextBox = driver.findElement(By.name("password"));
        pwdTextBox.sendKeys(Configuration.PASSWORD);
        pwdTextBox.submit();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(), 'Edit Account')]")));
	}

	@AfterEach
	public void logout() throws Exception {
		WebElement logOut = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"));
		driver.get(logOut.getAttribute("href"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Continue')]")));
		driver.quit();
	}

	protected WebDriver getDriver(){
		return this.driver;
	}

	protected WebDriverWait getWaiter(){
		return this.wait;
	}

}
