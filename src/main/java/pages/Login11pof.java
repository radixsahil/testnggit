package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login11pof {
	
	WebDriver driver ;



	public Login11pof(WebDriver driver)

	{

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	
	@FindBy (xpath = "//span[contains(text(),'My Account')]")
	private WebElement  clickmyaccount;
	
	@FindBy (xpath = "//a[contains(text(),'Login')]")
	private WebElement  clickonlogin;


	
	

	@FindBy (xpath = "//input[@id='input-email']") 
	private WebElement enterEmail;

	@FindBy (xpath = "//input[@id='input-password']") 
	private WebElement enterPassword;

//	@FindBy (xpath = "//body/main[1]/section[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[1]/div[5]") 
//	private WebElement clickLoginBtn;
	
	@FindBy (xpath = "//body/div[@id='account-login']/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/input[1]") 
	private WebElement clickLoginBtn;

	@FindBy (xpath = "//a[@class='list-group-item'][normalize-space()='Logout']") 
	private WebElement clickLogout;
	
	@FindBy (xpath = "//a[normalize-space()='Continue']") 
	private WebElement clickLogout2;
	

	public void gotolinpage() throws Exception {
		// TODO Auto-generated method stub
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[contains(text(),'My Account')]")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
//		
//		element = wait.until(ExpectedConditions.elementToBeClickable(element));
//		element.click();
		clickmyaccount.click();
		//Thread.sleep(3000);
		
		//WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(clickonlogin));
//		WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Login')]")));
//		element1.click();
		clickonlogin.click();
		
		
		
	}

	public void enteremail(String email) {
		// TODO Auto-generated method stub
		enterEmail.sendKeys(email);
		
	}




	public void enterpassword(String password) {
		// TODO Auto-generated method stub
		enterPassword.sendKeys(password);
	}




	public void clickonlogibutton() {
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
	
//		WebElement element2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Login']")));
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element2);
//		element2 = wait.until(ExpectedConditions.elementToBeClickable(element2));
//		element2.click();
		clickLoginBtn.click();
		
	}

	public void clicklogout() throws Exception {
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
//		WebElement element3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='list-group-item'][normalize-space()='Logout']")));
//		
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);
//		
//		element3 = wait.until(ExpectedConditions.elementToBeClickable(element3));
//		element3.click();
		
		Thread.sleep(3000);
		clickLogout.click();
		Thread.sleep(3000);
		clickLogout2.click();
		
	}
	
	
	
	
	

}
