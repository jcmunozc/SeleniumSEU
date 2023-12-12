package ch3_3_auto.elemactions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest1;
import common.Configuration;

public class Ex01EnterAndVerifyText extends BaseTest1{

	@Test
	void enterUserName() throws Exception{
        String expectedUserName = Configuration.USER_NAME;
        
        WebElement userTextBox = driver.findElement(By.name("email"));
        assertTrue(userTextBox.isEnabled(), "Assert that user name text box is enabled.");
        userTextBox.sendKeys(expectedUserName);
        Thread.sleep(3000);
        
        String actualUserName = userTextBox.getAttribute("value");
        assertEquals(expectedUserName,actualUserName,"USUARIO");
        
        WebElement txt_pass = driver.findElement(By.id("input-password"));
        txt_pass.sendKeys("Test123");
        Thread.sleep(3000);
        
	}
	
	

}
