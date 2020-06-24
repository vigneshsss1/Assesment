package PageObjectModelPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPages {


	@FindBy(xpath="//a[@id='nav-link-accountList']")
	public static WebElement loginbutton;


	@FindBy(xpath="//input[@type='email']")
	public static WebElement username;


	@FindBy(xpath="//input[@id='continue']")
	public static WebElement submit;

	@FindBy(xpath="//input[@type='password']")
	public static WebElement password;

	@FindBy(xpath="//input[@id='signInSubmit']") 
	public static WebElement submit1;


}
