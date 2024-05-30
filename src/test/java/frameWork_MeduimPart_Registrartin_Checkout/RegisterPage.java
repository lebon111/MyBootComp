package frameWork_MeduimPart_Registrartin_Checkout;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	public WebDriver driver;
	
	
	
	@FindBy(id = "FirstName")
    private WebElement firstNameField;

    @FindBy(id = "LastName")
    private WebElement lastNameField;


    @FindBy(id = "Email")
    private WebElement emailField;

    @FindBy(id = "Password")
    private WebElement passwordField;


    @FindBy(id = "ConfirmPassword")
    private WebElement confirmPasswordField;


    @FindBy(css = "button#register-button")
    private WebElement registerButton;


    public RegisterPage(WebDriver driver) {
    	this.driver = driver;
        PageFactory.initElements(driver, this);

    }


    public void enterFirstName(String firstName) {
          firstNameField.sendKeys(firstName);
    }
    
    public void enterLastName(String lastName) {
         lastNameField.sendKeys(lastName);
    }


    public void enterEmail(String email) {
        emailField.sendKeys(email);
    }

    public void enterPassword(String password) {
        passwordField.sendKeys(password);

    }
    public void enterConfirmPassword(String confirmPassword) {
        confirmPasswordField.sendKeys(confirmPassword);
    }
    public void clickRegisterButton() {
        registerButton.click();

    }

}


