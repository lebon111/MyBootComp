package frameWork_MeduimPart_Navigate_ToaDifferent_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerPage {
	public WebDriver driver;
	

	    @FindBy(linkText = "Build your own computer")
	    private WebElement buildYourOwnComputerLink;

	    public ComputerPage(WebDriver driver) {
	    	this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }

	    public void clickOnBuildYourOwnComputerLink() {
	        buildYourOwnComputerLink.click();
	    }
	}

