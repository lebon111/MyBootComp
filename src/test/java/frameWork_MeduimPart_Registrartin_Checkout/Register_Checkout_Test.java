package frameWork_MeduimPart_Registrartin_Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Register_Checkout_Test {
	public WebDriver driver;
	
	    @BeforeMethod
	    public void setup() {
	    	driver = new ChromeDriver();
		     driver.get("https://demo.nopcommerce.com");
		     
		
	}
	

	    @Test(priority = 1)
	    public void testSuccessfulRegistration() {
	        driver.findElement(By.linkText("Register")).click();

	        RegisterPage registrationPage = new RegisterPage(driver);

	        registrationPage.enterFirstName("John");
	        registrationPage.enterLastName("Davis");
	        registrationPage.enterEmail("john.davis@example.com");
	        registrationPage.enterPassword("password");
	        registrationPage.enterConfirmPassword("password");
	        registrationPage.clickRegisterButton();
	        //Assert.assertTrue(driver.findElement(By.cssSelector("div.result")).isDisplayed());

	        
	    }
	    @Test(priority = 2)
		public void checkOut() {
	     driver.findElement(By.linkText("Log in")).click();
	     CheckoutPage checkout = new CheckoutPage(driver);
	     checkout.Login();
	     checkout.jewelryLinkClick();
	     checkout.flowerGirlBraceletLinkClick();
	     checkout.retrieveFlowerGirlBraceletText();
	     checkout.addToCBtn();
	     //checkout.retrievegetAddedItemSuccessMessage();
	     checkout.homePageClick();
	     checkout.shoppingCLink();
	     checkout.agreeRadioC();
	     checkout.checkOutBtn();
	     checkout.billingAddressContinueClick();
	     checkout.shippingMethodcountinueClick();
	     checkout.paymentInfoContinueClick();
	     checkout.confirmContinueClick();

	}
	    @AfterMethod
		public void tearDown() {
			driver.quit();
		}
	}


