package ch3_2_auto.page;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import common.Configuration;

class Ex05JUnitVerifyTitle {

	@Test
	void testSiteTitle() throws Exception{
		WebDriver driver = Configuration.createChromeDriver();
        driver.get(Configuration.BLOG_URL);
        //Your Store
        String expectedTitle = "Your Store";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();	
	}
	
	@Test
	void testSiteTitle1() throws Exception{
		WebDriver driver = Configuration.createChromeDriver();
        driver.get(Configuration.BLOG_URL);
        //Your Store
        String expectedTitle = "Dummy";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
        driver.quit();	
	}
}
