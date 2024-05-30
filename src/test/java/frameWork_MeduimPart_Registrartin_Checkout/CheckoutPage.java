package frameWork_MeduimPart_Registrartin_Checkout;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	public WebDriver driver;
	
	@FindBy (css = "img[alt='nopCommerce demo store']")
	private WebElement homaPage;
	
	
	@FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "Password")
    private WebElement passwordField;

    @FindBy(id = "login-button")
    private WebElement loginButton;
    
    @FindBy(css = "ul[class='top-menu notmobile'] li:nth-child(6) a:nth-child(1)")
    private WebElement jewelryLink;
    
    @FindBy(css = "div:nth-of-type(2) > .product-item  h2 > a")
    private WebElement flowerGirlBraceletLink;
    
    @FindBy(css = "div[class='product-name'] h1")
    private WebElement flowerGirlBraceletText;
    
    @FindBy(css = ".add-to-cart-button.button-1")
    private WebElement addToCartBtn;
    
    @FindBy(xpath = "//p[@class='content']")
    private WebElement getAddedItemSuccessMessage;

    @FindBy(css = ".cart-label")
    private WebElement shoppingCartLink;
    
    @FindBy(css = "input#termsofservice")
    private WebElement agreeCheckRadio ;
    
    @FindBy(css = "button#checkout")
    private WebElement checkOutBtn ;
    
    @FindBy(css = "#billing-buttons-container [class='button-1 new-address-next-step-button']")
    private WebElement billingAddressContinue;
    
    @FindBy(css = "div#shipping-method-buttons-container > .button-1.shipping-method-next-step-button")
    private WebElement shippingMethodcountinue;
    
    @FindBy(css = "div#payment-method-buttons-container > button[name='save']")
    private WebElement paymentMethodContinue;
    
    @FindBy(css = "div#payment-info-buttons-container > .button-1.payment-info-next-step-button")
    private WebElement paymentInfoContinue;
    
    @FindBy(css = "div#confirm-order-buttons-container > .button-1.confirm-order-next-step-button")
    private WebElement confirmContinue;
    
    
    
    
    
    
    public CheckoutPage(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void Login() {
    	driver.findElement(By.id("Email")).sendKeys("tamerseo@yahoo.com");
		driver.findElement(By.id("Password")).sendKeys("Simo1980@");
		driver.findElement(By.cssSelector(".button-1.login-button")).click();
    }

    public void enterEmail(String email) {
        emailField.sendKeys(email);

    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);

    }

    public void clickLoginButton() {
        loginButton.click();

    }
    public void jewelryLinkClick() {
    	jewelryLink.click();
    }
    public void flowerGirlBraceletLinkClick() {
    	flowerGirlBraceletLink.click();
	
    }
    public String retrieveFlowerGirlBraceletText() {
    	String retrieveText = flowerGirlBraceletText.getText();
    	return retrieveText;
    }
    
    public void addToCBtn() {
    	addToCartBtn.click();
    	
    }
    
    public String retrievegetAddedItemSuccessMessage() {
    	String ItemSuccessMessage = getAddedItemSuccessMessage.getText();
    	return ItemSuccessMessage;
    	
    }
    
    public void shoppingCLink() {
    	shoppingCartLink.click();
    	
    }
    public void agreeRadioC() {
    	agreeCheckRadio.click();
    	
    }
    public void checkOutBtn() {
    	checkOutBtn.click();
    	
    }
    
    public void billingAddressContinueClick() {
    	billingAddressContinue.click();    	
    	
    }
    public void shippingMethodcountinueClick() {
    	shippingMethodcountinue.click();
    	
    	
    }
    public void paymentInfoContinueClick() {
    	paymentInfoContinue.click();
	
	
}
    public void confirmContinueClick() {
    	confirmContinue.click();
	
	
}
    public void homePageClick() {
    	homaPage.click();
    }
    

}
