package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import common.BaseTest2;
import common.BaseTestUrls;

/*
 * Select Week start as Monday on Wordpress Settings Page. Assert correct selection.
*/
public class Ex02SelectControl  extends BaseTestUrls{
	//URL_PRODUCTO
	/*
	 * Handling a drop down list with clicks
	 */
	@Test
	public void test01() throws Exception{
			
		//Lista
		Thread.sleep(5000);
		WebElement rawDropDown = this.getDriver().findElement(By.id("input-sort"));
		rawDropDown.click();
		Thread.sleep(5000);
		
		//Click opción
		WebElement option = getDriver().findElement(By.xpath("//*[contains(text(),'Price (High > Low')]"));
		option.click();
		Thread.sleep(5000);
		
		
	}
	
	/*
	 * Handling a drop down list sendKeys
	 */
	@Test
	public void test02() throws Exception{
		//Opción esperada
		String expectedDay = "Rating (Lowest)";
		
		Thread.sleep(5000);
		WebElement rawDropDown = this.getDriver().findElement(By.id("input-sort"));
		rawDropDown.sendKeys(expectedDay);
		Thread.sleep(5000);	
	}
	
	/*
	 * Handling a drop down list as a Select control
	 */
	@Test
	public void test03() throws Exception {
		//Opción esperada
		String expectedOption = "25";
		
		Thread.sleep(5000);
		Select optionStart = new Select(getDriver().findElement(By.id("input-limit")));
		optionStart.selectByVisibleText(expectedOption);
		//optionStart.selectByIndex(2);
		
		Thread.sleep(5000);
		
		
		
		
		 
	}

}
