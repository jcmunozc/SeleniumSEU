package common;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BasePrueba {
	protected static WebDriver driver = null;
	
	@BeforeAll
	public static void launchBrowser() throws Exception {
        driver = Configuration.createChromeDriver();	
        driver.get(Configuration.ADMIN_URL);
        //driver.get(Configuration.URL_PRUEBAS);
        Thread.sleep(2000);
	}

	@AfterAll
	public static void closeBrowser() {
        driver.quit();		
	}
}
