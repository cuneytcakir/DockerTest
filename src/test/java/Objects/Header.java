package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
	
	private static WebElement element = null;
	
	public static WebElement Logo(WebDriver driver){
		 
		element = driver.findElement(By.cssSelector("a[class=\"blutv-logo\"]"));
	    return element;
	 
	    }
	
	public static WebElement Hesabim(WebDriver driver){
		 
		element = driver.findElement(By.cssSelector("a[ng-if=\"userInfo\"]"));
	    return element;
	 
	    }

}
