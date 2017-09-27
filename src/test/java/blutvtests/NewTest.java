package blutvtests;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import Objects.Header;
import Objects.LoginObjects;
import bsh.Capabilities;
import methods.Retry;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;		

public class NewTest {		
	    private WebDriver driver;
	    private DesiredCapabilities capabilities;
	    
	    @BeforeTest
		public void setup() throws Exception{
			/*FirefoxProfile profile = new FirefoxProfile();
			capabilities = DesiredCapabilities.firefox();
			capabilities.setCapability(FirefoxDriver.PROFILE, profile);
			capabilities.setCapability("marionette",true);*/
			
	    	ChromeOptions options = new ChromeOptions();
			capabilities = DesiredCapabilities.chrome();
			capabilities.setCapability(ChromeOptions.CAPABILITY,options);
	    	
			driver = new RemoteWebDriver(new URL("http://localhost:5000/wd/hub"), capabilities);
		}
		
		@AfterTest
		public void afterTest() {
			driver.quit();	
			
		}
				
		@Test
		public void login() {	
			driver.get("https://www.blutv.com.tr/");  
			//LoginObjects.UyeGirisi(driver).click();
		}
		
		
}