package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	static WebDriver driver;
	static String browser = null;
	static String url = null;

	public static WebDriver readConfig() {	
	
		System.out.println("Before Class");
		Properties prop = new Properties();
		//InputStream //BufferReader //FileReader //Scanner
		
		try{
			InputStream input = new FileInputStream("/Users/Dechen/Documents/JAN2021SELENIUM/XLM_Project/src/main/java/config/config.properties");
			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("Browser used: " + browser);
			url = prop.getProperty("url");
			System.out.println("Used Enviornment:" + url);

		
		}catch(IOException e) {
			
			e.printStackTrace();
		}
		return driver;
		
	}

	public static WebDriver init() {
		readConfig();

		if (browser.equalsIgnoreCase("Chrome")) {

			System.setProperty("webdiver.chrome.driver", "chromedriver");
			driver = new ChromeDriver();
		} else if (browser.equalsIgnoreCase("firefox")) {

			System.setProperty("webdiver.gecko.driver", "geckodriver");
			driver = new FirefoxDriver();
		}

		driver.get(url);
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}

	public static void tearDown() {
		driver.close();
		driver.quit();

	}
}

