package frameWork_MeduimPart_Navigate_ToaDifferent_Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavigateTest {

	    WebDriver driver;
	    HomePage homePage;
	    ComputerPage computerPage;
	    BuildYourOwnComputerPage buildYourOwnComputerPage;

	    @BeforeTest
	    public void setup() {
	        driver = new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://demo.nopcommerce.com/");
	        homePage = new HomePage(driver);
	        computerPage = new ComputerPage(driver);
	        buildYourOwnComputerPage = new BuildYourOwnComputerPage(driver);
	    }

	    @Test
	    public void navigateToBuildYourOwnComputerPage() {
	        homePage.clickOnComputersLink();
	        computerPage.clickOnBuildYourOwnComputerLink();
	        buildYourOwnComputerPage.selectRam("2GB");

}
	    @AfterMethod
		public void tearDown() {
			driver.quit();
		}
}
