package ch4_auto.beyond;


import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;
import common.SeleniumUtils;

class Ex03MultiMatch extends BaseTest2{
//URL_PRODUCTO_PLP
	@Test
	void selectAllCategories() throws Exception{
		
		
		// Find All product for categories
		List<WebElement> delCheckboxes = getDriver().findElements(By.xpath("//*[contains(@class, 'product-layout')]"));
		
		
		System.out.println("Product count:" + delCheckboxes.size());
		
		for(WebElement element: delCheckboxes) {
			SeleniumUtils.printElementInfo("Category Checkbox", element);
			Thread.sleep(5000);
			
		}
	}
	
}
