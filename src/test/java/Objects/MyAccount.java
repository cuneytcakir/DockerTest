package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccount {
	
	private static WebElement element = null;
	
	public static WebElement Cikis(WebDriver driver){
		 
		element = driver.findElement(By.cssSelector("a[class=\"logout\"]"));
	    return element;
	 
	    }

}
