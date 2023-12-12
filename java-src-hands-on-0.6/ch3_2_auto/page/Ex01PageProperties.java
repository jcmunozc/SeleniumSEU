package ch3_2_auto.page;

import org.openqa.selenium.WebDriver;

import common.Configuration;

public class Ex01PageProperties {
 	public static void main(String[] args) throws Exception {
        WebDriver driver = Configuration.createChromeDriver();
        driver.get(Configuration.BLOG_URL);
        Thread.sleep(3000);
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("ID Ventana: " + driver.getWindowHandle());
        
        driver.get(Configuration.ADMIN_URL);
        Thread.sleep(3000);
        System.out.println("URL: " + driver.getCurrentUrl());
        System.out.println("Title: " + driver.getTitle());
        System.out.println("ID Ventana: " + driver.getWindowHandle());
        
        
        //System.out.println("Page Source: " + driver.getPageSource());
        
        
        driver.quit();
 	}
}

