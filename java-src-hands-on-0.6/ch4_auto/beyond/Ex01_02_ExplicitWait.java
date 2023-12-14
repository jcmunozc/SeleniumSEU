package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.Configuration;

public class Ex01_02_ExplicitWait {
	
	@Test
	public void test() throws Exception {
		// Create Driver
		WebDriver driver = Configuration.createChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		// Login
		driver.get(Configuration.ADMIN_URL);
		
		WebElement userTextBox = wait.until(ExpectedConditions.elementToBeClickable(By.name("email")));
		userTextBox.sendKeys(Configuration.USER_NAME);
		assertEquals(Configuration.USER_NAME, userTextBox.getAttribute("value"), "Assert the user name text.");
		
		WebElement pwdTextBox = driver.findElement(By.name("password"));
		pwdTextBox.sendKeys(Configuration.PASSWORD);
		assertEquals(Configuration.PASSWORD, pwdTextBox.getAttribute("value"), "Assert the password text.");
		
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@type='submit' and @value='Login']")));
		submitButton.click();

		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[contains(text(), 'Edit Account')]")));

        // Logout
        WebElement logOut = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"));
		driver.get(logOut.getAttribute("href"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Continue')]")));
		driver.quit();
	}

}
