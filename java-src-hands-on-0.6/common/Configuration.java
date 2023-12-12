package common;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Configuration {
	public static String DRIVER_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "drivers"
			+ File.separator;
			
	public static String CHROME_DRIVER_PATH = DRIVER_DIR + "chromedriver";
	public static String GECKO_DRIVER_PATH = DRIVER_DIR + "geckodriver";
	
	//private static String IP = "http://opencart.abstracta.us/"; 
	public static String BLOG_URL = "http://opencart.abstracta.us/";
	public static String ADMIN_URL = BLOG_URL + "/index.php?route=account/login";
	public static String URL_PRODUCTO = BLOG_URL + "/index.php?route=product/category&path=25_28";
	public static String URL_PRODUCTO_APPLE = BLOG_URL + "/index.php?route=product/product&path=25_28&product_id=42";
	public static String URL_PRODUCTO_PLP = BLOG_URL + "/index.php?route=product/category&path=24";
	public static String URL_PRUEBAS = "https://www.petco.com.mx/petco/en/login";
	
	
	public static String DIR_ARCHIVOS= "C:/ambiente/workspace/java-src-hands-on-0.6.zip_expanded/archivos";
	public static String URL_FILE_UPLOAD = DIR_ARCHIVOS+"/upload_file.html";
	//public static String URL_FILE_UPLOAD = "http://www.automationpractice.pl/index.php?controller=contact";
	public static String URL_FILE = DIR_ARCHIVOS+"/archivo_subida.txt";
	
	
	public static String URL_FRAMES = DIR_ARCHIVOS+"/frames.html";
	public static String URL_DEMO_QA ="https://demoqa.com/alerts";
	
	
	
	
	public static String USER_NAME = "test02_testing@yopmail.com";
	public static String PASSWORD = "Test02";
	
	public static String SCREENSHOTS_DIR = System.getProperty("user.dir") 
			+ File.separator
			+ "screenshots"
			+ File.separator;
	
	private static String modifyIfWindows(String inPath) {
		if (System.getProperty("os.name").toLowerCase().contains("windows")){
			return inPath + ".exe";
		} else {
			return inPath;
		}
	}
	
	public static WebDriver createChromeDriver() {
		System.setProperty("webdriver.chrome.driver", modifyIfWindows(CHROME_DRIVER_PATH));
		return new ChromeDriver();
	}
	
	public static WebDriver createFireFoxDriver() {
		System.setProperty("webdriver.gecko.driver", modifyIfWindows(GECKO_DRIVER_PATH));
		return new FirefoxDriver();
	}
	
	/*public static WebDriver createHtmlUnitDriver() {
		// To enable JavaScript, pass true as argument
		return new HtmlUnitDriver(true);
	}*/
	
	public static WebDriver createChromeHeadless() {
		System.setProperty("webdriver.chrome.driver", modifyIfWindows(CHROME_DRIVER_PATH));
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--headless","--disable-gpu");
		return new ChromeDriver(options);
	}

	
	
}
