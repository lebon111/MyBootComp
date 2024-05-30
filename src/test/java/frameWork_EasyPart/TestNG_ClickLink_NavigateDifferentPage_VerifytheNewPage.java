package frameWork_EasyPart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_ClickLink_NavigateDifferentPage_VerifytheNewPage {
	public WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}
	@Test
	public void verifyTitle() {
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://flipkart.com");
		driver.findElement(By.xpath("//div[@id = 'toast-ctn']")).click();		
		driver.findElement(By.linkText("Electronics GST Store")).click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
