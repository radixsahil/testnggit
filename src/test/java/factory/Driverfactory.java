package factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class Driverfactory {
	
	
	static WebDriver driver = null;
	
	public static void initilizeBrowser(String browserName)
	
	{
	
					
		if(browserName.equals("chrome"))
		{
			ChromeOptions co = new ChromeOptions();
			co.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(co);
			
//			ChromeOptions co = new ChromeOptions();
//			co.addArguments("enable-automation");
//			co.addArguments("--headless");
//			co.addArguments("--window-size=1920,1080");
//			co.addArguments("--no-sandbox");
//			co.addArguments("--disable-extensions");
//			co.addArguments("--dns-prefetch-disable");
//			co.addArguments("--disable-gpu");
//			driver = new ChromeDriver(co);
			
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahil.kadia\\Documents\\automation\\jeprojectTestng\\chromedriver-win64\\chromedriver.exe");
//			 ChromeOptions co = new ChromeOptions();
////			 co.addArguments("enable-automation");
////				co.addArguments("--headless");
////				
////				co.addArguments("--no-sandbox");
//				co.addArguments("--remote-allow-origins=*");
//				co.addArguments("--disable-dev-shm-usage"); 
//				co.addArguments("--ignore-ssl-errors=yes"); 
//				co.addArguments("--ignore-certificate-errors"); 
////		       
//		        // Initialize WebDriver
//		      driver = new ChromeDriver();
			//driver = new ChromeDriver();
		}
		else 
		{
		
		 //driver = new FirefoxDriver();
			FirefoxProfile profile = new FirefoxProfile();
			FirefoxOptions options = new FirefoxOptions();
			options.setProfile(profile);
			driver = new FirefoxDriver(options);
			//WebDriver driver = new RemoteWebDriver(new URL(SelenoidIP/wd/hub), firefoxOptions);
		}
		
		
	}
	
	
	
	public static WebDriver getDriver()
	{
		
	return driver;
	}
	

}
