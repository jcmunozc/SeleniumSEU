package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.Configuration;

public class Ex01_01_ImplicitWait {
	
	@Test
	public void test() throws Exception {
		// Create Driver
		WebDriver driver = Configuration.createChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Login
		driver.get(Configuration.ADMIN_URL);
        WebElement userTextBox = driver.findElement(By.name("email"));
        userTextBox.sendKeys(Configuration.USER_NAME);
        WebElement pwdTextBox = driver.findElement(By.name("passwor"));
        pwdTextBox.sendKeys(Configuration.PASSWORD);
        pwdTextBox.submit();
        boolean dboardLoaded = driver.findElement(By.xpath("//*[contains(text(), 'Edit Account')]")).isDisplayed();
        assertTrue(dboardLoaded, "Assert that dashbaord is laoded.");

        // Logout
        WebElement logOut = driver.findElement(By.xpath("//*[contains(text(), 'Logout')]"));
		driver.get(logOut.getAttribute("href"));
		WebElement logoutMsg = driver.findElement(By.xpath("//*[contains(text(),'Continue')]"));
		assertTrue(logoutMsg.isDisplayed(), "Assert successful logout.");
		driver.quit();
	}

}
