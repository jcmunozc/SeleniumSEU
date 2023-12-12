package ch3_1_auto.browser;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex05BrowserMethods {
 	public static void main(String[] args) throws Exception {
 		
        WebDriver driver = Configuration.createChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://amazon.com");
        driver.get(Configuration.BLOG_URL);
        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(3000);
        driver.navigate().refresh();
        Thread.sleep(3000);
        
               
        System.out.println("Window Handle: " + driver.getWindowHandle());
        System.out.println("Window Handle: " + driver.getTitle());
        
        for (String win: driver.getWindowHandles()){
                System.out.println("WindowsHandles: " + win);
        }
        driver.quit();
 	}
}

