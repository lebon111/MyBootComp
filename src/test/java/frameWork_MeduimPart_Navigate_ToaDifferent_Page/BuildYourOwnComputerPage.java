package frameWork_MeduimPart_Navigate_ToaDifferent_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BuildYourOwnComputerPage {
	public WebDriver driver;

	    @FindBy(id = "product_attribute_1")
	    private WebElement processorDropdown;

	    @FindBy(id = "product_attribute_2")
	    private WebElement ramDropdown;

	    @FindBy(id = "add-to-cart-button-1")
	    private WebElement addToCartButton;

	    public BuildYourOwnComputerPage(WebDriver driver) {
	    	this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void selectProcessor(String processor) {
	        processorDropdown.sendKeys(processor);
	    }

	    public void selectRam(String ram) {
	        ramDropdown.sendKeys(ram);
	    }

	    public void clickAddToCartButton() {
	        addToCartButton.click();
	    }
	}


