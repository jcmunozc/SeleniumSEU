package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import common.BaseTest1;
import common.Configuration;

class Ex02LoginLogout_EW extends BaseTest1{

	@Test
	public void test() throws Exception {
		// Create Driver
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement lnk_password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//*[contains(text(),'Password')])[2]")));
        lnk_password.click();
       
	}
	
}
