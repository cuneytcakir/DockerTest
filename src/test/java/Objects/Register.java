package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	
	private static WebElement element = null;
	 
	public static WebElement UcretsizDene(WebDriver driver){
		 
		element = driver.findElement(By.cssSelector("a[ui-sref=\"root.kayit\"]"));
	    return element;
	 
	    } 
	public static WebElement Ad(WebDriver driver){
	 
		element = driver.findElement(By.cssSelector("input[name=\"firstname\"]"));
	    return element;
	 
	    }
	 
	 public static WebElement SoyAd(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("input[name=\"lastname\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Email(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("input[name=\"email\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Sifre(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("input[name=\"password\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement SifreKontrol(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("input[name=\"passwordcheck\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement KuponKodu_label(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("a[ng-click=\"couponChange(true)\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Kod_textbox(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("input[name=\"couponcode\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Sozlesme(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("label[class=\"item item-field is-checkbox\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement DevamEt(WebDriver driver){
		 
			element = driver.findElement(By.cssSelector("button[type=\"submit\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Hata(WebDriver driver){
		 
		    element = driver.findElement(By.className("alert-message"));
		    return element;
		 
		    }
	 
	 public static WebElement Hata_IsimYaz(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && registerForm.firstname.$error.required\"]"));
		 	return element;
		 
		    }
	 
	 public static WebElement Hata_SoyisimYaz(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && registerForm.lastname.$error.required\"]"));
		 	return element;
		 
		    }
	 
	 public static WebElement Hata_MailYaz(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && registerForm.email.$error.required\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Hata_SifreYaz(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && registerForm.password.$error.required\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement Hata_SifreCheck(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("span[ng-show=\"Submit && registerForm.password !== registerForm.passwordcheck\"]"));
		    return element;
		 
		    }
	 
	 public static WebElement DenemeUyelik_text(WebDriver driver){
		 
		 element = driver.findElement(By.cssSelector("h3[ng-if=\"userInfo.IsNew\"]"));
		    return element;
		 
		    }
	 
	 

}
