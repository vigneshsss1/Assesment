package PageObjectModelPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPages {

	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
    public static WebElement searchbox;
	
	
	@FindBy(xpath="//span[text()='Lifebuoy Alcohol Based Germ Protection Hand Sanitizer 500ml']")
	public static WebElement product;
	
	
	
	
}
