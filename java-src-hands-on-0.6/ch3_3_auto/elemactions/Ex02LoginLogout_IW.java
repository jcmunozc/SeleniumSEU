package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Configuration;

class Ex02LoginLogout_IW{

	@Test
	public void test() throws Exception {
		// Create Driver
		WebDriver driver = Configuration.createChromeDriver();

		// Login
		driver.get(Configuration.ADMIN_URL);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		

        WebElement userTextBox = driver.findElement(By.name("email"));
        userTextBox.sendKeys(Configuration.USER_NAME);
        WebElement pwdTextBox = driver.findElement(By.name("password"));
        pwdTextBox.sendKeys(Configuration.PASSWORD);
        pwdTextBox.submit();
       
        boolean dboardLoaded = driver.findElement(By.xpath("//*[contains(text(), 'Edit Account')]")).isDisplayed();
        assertTrue(dboardLoaded, "Assert that dashbaord is laoded.");

        // Logout
        WebElement logOut = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"));
		driver.get(logOut.getAttribute("href"));
		
		WebElement logoutMsg = driver.findElement(By.xpath("//*[contains(text(),'Continue')]"));
		assertTrue(logoutMsg.isDisplayed(), "Account");
		driver.quit();
	}
	
}
