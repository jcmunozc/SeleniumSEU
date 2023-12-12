package ch4_auto.beyond;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import common.BaseTest2;
import common.Configuration;

public class Ex09HandlingAlert  {
//DEMO QA
    @Test
    public void AceptFile() throws InterruptedException{
    	
    	WebDriver driver = Configuration.createChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(Configuration.URL_DEMO_QA);
    	
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Click me')])[3]")));
		submitButton.click();
		
        // Esperar y Aceptar la alerta
		//Thread.sleep(5000);
		driver.switchTo().alert().accept();
        
		driver.quit();
        
        
    }
    
    
    @Test
    public void deleteFile() throws InterruptedException{
    	
    	WebDriver driver = Configuration.createChromeDriver();
    	driver.manage().window().maximize();
    	driver.get(Configuration.URL_DEMO_QA);
    	
		//WebDriverWait wait = new WebDriverWait(driver, 60);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[contains(text(),'Click me')])[3]")));
		submitButton.click();
		
       
		//Thread.sleep(5000);
		driver.switchTo().alert().dismiss();
        
		driver.quit();
        
     
        
        
    }
}
