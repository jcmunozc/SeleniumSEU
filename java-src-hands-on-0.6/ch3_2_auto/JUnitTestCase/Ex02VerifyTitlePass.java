package ch3_2_auto.JUnitTestCase;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex02VerifyTitlePass {

	public static void main(String[] args) throws Exception {
        WebDriver driver = Configuration.createChromeDriver();
        driver.get(Configuration.BLOG_URL);
        // Use the appropriate Your Store
        String expectedTitle = "Your Store";
        String actualTitle = driver.getTitle();
        driver.quit();
        if (!expectedTitle.equals(actualTitle)){
        	throw new Exception(
        			String.format("Failure: Title does not match. Expected: <%s> Actual: <%s>",
        					expectedTitle,
        					actualTitle
        					
      
        					));
        	
        }
        
	}
}
