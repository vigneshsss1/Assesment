package PageObjectModelPages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToFunctionality {

	@FindBy(id="hlb-view-cart")
	public static WebElement cart;
	
	
	@FindBy(xpath="//input[@name='submit.delete.C5add552c-7b58-459b-9a27-b872f619bae5']")
	public static WebElement delete;
	
}
