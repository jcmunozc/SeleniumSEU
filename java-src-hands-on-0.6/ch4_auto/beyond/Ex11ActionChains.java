package ch4_auto.beyond;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import common.BaseTest2;
//BLOG_URL
public class Ex11ActionChains extends BaseTest2{
	
	@Test
	public void hoverAndClick() throws Exception {
        WebElement menuBar = getDriver().findElement(By.xpath("//a[text()='Desktops']"));
        //WebElement subMenuBar = getDriver().findElement(By.xpath("//a[text()='Mac (1)']"));
        
        Actions builder = new Actions(getDriver());
        builder.moveToElement(menuBar)
        .pause(1000)
        .click(getDriver().findElement(By.xpath("//a[text()='Mac (1)']")));
		
		// Build composite action.
		Action compAction = builder.build();
		
		// Perform Action (Till this 
		compAction.perform();

		
	}
}
