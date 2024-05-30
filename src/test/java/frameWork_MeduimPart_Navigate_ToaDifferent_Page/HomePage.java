package frameWork_MeduimPart_Navigate_ToaDifferent_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;


	    @FindBy(linkText = "Computers")
	    private WebElement computersLink;

	    public HomePage(WebDriver driver) {
	    	this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickOnComputersLink() {
	        computersLink.click();
	    }
	}


