package ch4_auto.beyond;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.BaseTest2;
import common.SeleniumUtils;

class Ex04NestedElements extends BaseTest2{
//URL PLP
	@Test
	void clickFirstCheckbox() throws Exception{
			
		WebElement table = getDriver().findElement(By.xpath("//*[contains(@class, 'product-layout')]"));
		WebElement lbl_precio = table.findElement(By.xpath(".//*[@class='price-tax']"));
		WebElement img_producto = table.findElement(By.xpath(".//*[@class='product-thumb']//*[contains(@class, 'img-responsive')]/ancestor::a"));
		SeleniumUtils.printElementInfo("Category Checkbox", lbl_precio);
		SeleniumUtils.printElementInfo("Category Checkbox", img_producto);
		img_producto.click();
		Thread.sleep(3000);
	}

}
