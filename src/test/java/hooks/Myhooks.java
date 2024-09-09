package hooks;

import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import factory.Driverfactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Myhooks {
	WebDriver driver;
	
	
	@Before
	public void setup() {
	Driverfactory.initilizeBrowser("chrome");
	driver = Driverfactory.getDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//driver.get("https://www.alacalc.com");
	driver.get("https://tutorialsninja.com/demo/");
	
	
	
	}
	
	@After
	public void tearDown(Scenario scenario)
	{
		String scenarioName = scenario.getName().replaceAll(" ", "_");
		
		if(scenario.isFailed())
			
		{
			
			byte[] srcScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.attach(srcScreenShot, "image/png", scenarioName);
		}
		
		
		driver.quit();
	}

}
