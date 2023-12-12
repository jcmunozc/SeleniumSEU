package ch4_auto.beyond;

import java.io.File;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;
import common.Configuration;

public class Ex05UploadFile  extends BaseTest2{
//URL_FILE_UPLOAD
	
	
	@Test
	public void uploadFile() throws InterruptedException {
		// Archivo
		String expectedFileName = Configuration.URL_FILE;
		
		WebElement browseButton = getDriver().findElement(By.name("myFile"));
			
		browseButton.sendKeys(expectedFileName);	
		Thread.sleep(3000);
		getDriver().findElement(By.id("uploadFile")).click();
		
	}
}
