package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;

public class Ex06JsExecution  extends BaseTest2{
//ADMIN_URL
    @Test
    public void js() throws InterruptedException{
		JavascriptExecutor jsExec = (JavascriptExecutor) getDriver();
		
		// Execute find and click event in JavaScript
		jsExec.executeScript("document.getElementsByName('search')[0].value = 'MI BUSQUEDA DESDE JS';");
		Thread.sleep(5000);
		
		// Find in WebDriver, Click in JavaScript
		WebElement viewSiteLink = getDriver().findElement(By.name("search"));
		jsExec.executeScript("arguments[0].value = ''; arguments[0].value = arguments[1];", viewSiteLink, "MI 2DA BUSQUEDA DESDE JS");
		Thread.sleep(5000);
		
		// Find in JS and return web element, then click in Java
		WebElement siteLink = (WebElement) jsExec.executeScript("return document.getElementsByName('search')[0]");
		siteLink.clear();
		siteLink.sendKeys("MI 3RA BUSQUEDA DESDE JS");
		Thread.sleep(5000);
		
    }
}
