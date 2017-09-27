package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginObjects {
	
	private static WebElement element = null;
	 
	 public static WebElement UyeGirisi(WebDriver driver){
	 
	    element = driver.findElement(By.xpath("/html/body/header/div/div/div/a[34]"));
	    return element;
	 
	    }
	 
	 public static WebElement Eposta(WebDriver driver){
		 
		    element = driver.findElement(By.name("username"));
		    return element;
		 
		    }
	 
	 public static WebElement Sifre(WebDriver driver){
		 
		    element = driver.findElement(By.name("password"));
		    return element;
		 
		    }
	 
	 public static WebElement Error_EpostaYaz(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && loginForm.username.$error.required\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Error_SifreYaz(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && loginForm.password.$error.required\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Error_EpostaPattern(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && loginForm.username.$error.pattern\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Hata(WebDriver driver){
		 
		    element = driver.findElement(By.className("alert-message"));
		    return element;
		 
		    }
	 
	 public static WebElement GirisYap_bttn(WebDriver driver){
		 
		    element = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		    return element;
		 
		    }

}
