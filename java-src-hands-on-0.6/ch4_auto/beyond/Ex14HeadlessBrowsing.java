package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import common.Configuration;
import common.SeleniumUtils;

public class Ex14HeadlessBrowsing {

	@Test
	public void runHeadless() {
		WebDriver driver = Configuration.createChromeHeadless();
		driver.get(Configuration.ADMIN_URL);
		System.out.println(driver.getPageSource());
		WebElement user = driver.findElement(By.name("email"));
		SeleniumUtils.printElementInfo("Username text box", user);
		user.sendKeys(Configuration.USER_NAME);
		assertEquals(Configuration.USER_NAME, user.getAttribute("value"));
		driver.quit();
	}
}