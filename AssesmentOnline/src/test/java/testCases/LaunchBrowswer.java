package testCases;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjectModelPages.AddToFunctionality;
import PageObjectModelPages.AddTocart;
import PageObjectModelPages.LoginPages;
import PageObjectModelPages.MainPages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowswer extends PropertyFile{
	WebDriver driver;

		@Test(description = "launch the url",priority = 0)
		public void lauchApp() throws FileNotFoundException, IOException, InterruptedException {
			
		String urldata = PropertyFile.readConfig("url");

		WebDriverManager.chromedriver().setup();

		driver =new ChromeDriver();

		driver.manage().window().maximize();

		driver.get(urldata);

		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		String expected=driver.getCurrentUrl();
		
		Assert.assertEquals("https://www.amazon.in/", expected);
		
		

		Thread.sleep(5000);

	}
		@Test(description = "enter username and password",priority = 1)
		
		
		public void loginPage() throws FileNotFoundException, IOException {

		PageFactory.initElements(driver,LoginPages.class);
		
		String username = PropertyFile.readConfig("username");
		
		String password = PropertyFile.readConfig("password");
		
		LoginPages.loginbutton.click();
		
		LoginPages.username.sendKeys(username);
		
		LoginPages.submit.click();
		
		LoginPages.password.sendKeys(password);
		
		LoginPages.submit1.click();

	}
		@Test(description = "searching product",priority = 2)
		public void ProductPage() {

		PageFactory.initElements(driver,MainPages.class);

		MainPages.searchbox.sendKeys("sanitizers",Keys.ENTER);

		MainPages.product.click();
	}
		@Test(priority = 3)
		public void switchWindow() {

		String parentwindow=driver.getWindowHandle();


		Set<String>handles=driver.getWindowHandles();

		Iterator<String>itr=handles.iterator();

		String pi=itr.next();

		String sc=itr.next();

		driver.switchTo().window(sc);

		PageFactory.initElements(driver,AddTocart.class);

		AddTocart.addtocart.click();

	}
		@Test(description = "add to cart",priority = 4)
		public void toDeleteTheElementFromThecart() throws InterruptedException {

		PageFactory.initElements(driver,AddToFunctionality.class);		

		AddToFunctionality.cart.click();
			
		Thread.sleep(3000);
		
		AddToFunctionality.delete.click();

	}

}