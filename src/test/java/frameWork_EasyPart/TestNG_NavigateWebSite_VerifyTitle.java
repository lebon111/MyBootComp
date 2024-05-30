package frameWork_EasyPart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_NavigateWebSite_VerifyTitle {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tutorialsninja.com/demo");
		
	}
	
	@Test
	public void verifyTitle() {
	String actualTitle = driver.getTitle(); 
	System.out.println(actualTitle); 
	String expectedTitle = "Your Store";
	if(expectedTitle.equals(actualTitle)) {
		System.out.println("Title Correct");
	}else {
		System.out.println("The title of Landing Page are incorrect");
	}

	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	

}
