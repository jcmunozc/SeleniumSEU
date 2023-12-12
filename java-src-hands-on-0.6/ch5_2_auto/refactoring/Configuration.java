package ch5_2_auto.refactoring;

import java.io.File;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Configuration {
	
	private static String ROOT_DIR = System.getProperty("user.dir") + File.separator;
	private static String DRIVERS_DIR = ROOT_DIR + "drivers" + File.separator;
	
	public static String CHROME_DRIVER = DRIVERS_DIR + "chromedriver";
	public static String FIREFOX_DRIVER = DRIVERS_DIR + "geckodriver";
	
	//private static String IP = "http://192.168.56.101";
	public static String BLOG_URL = "http://opencart.abstracta.us/";
	public static String ADMIN_URL = BLOG_URL + "/index.php?route=account/login";
	public static String USER_NAME = "test02_testing@yopmail.com";
	public static String PASSWORD = "Test02";
	public static final long MAX_WAIT_TIME = 5;
	
	public static String SCREENSHOTS_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "screenshots"
			+ File.separator;	

	public final static Logger LOGGER = LogManager.getLogger("CSE");
}
