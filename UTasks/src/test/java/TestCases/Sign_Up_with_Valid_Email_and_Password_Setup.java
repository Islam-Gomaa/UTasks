package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import UTasks.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sign_Up_with_Valid_Email_and_Password_Setup {

	WebDriver driver;

	@Test
	public void navigate_to_Sign_Up_with_Valid_Email_and_Password_Edge() {

		// Edge Driver
		WebDriverManager.edgedriver().setup();

		// Initialize Edge Driver
		driver = new EdgeDriver();

		driver.navigate().to("https://utasks-main.web.app/signup");
		driver.manage().window().maximize();

		Sign_Up_with_Valid_Email_and_Password sign = new Sign_Up_with_Valid_Email_and_Password();
		sign.Sign_Up_Edge(driver);

		driver.quit();
	}

	@Test
	public void navigate_to_Sign_Up_with_Valid_Email_and_PasswordF_firefox() {

		// FirefoxDriver
		WebDriverManager.firefoxdriver().setup();

		// Initialize FirefoxDriver
		driver = new FirefoxDriver();

		driver.navigate().to("https://utasks-main.web.app/signup");
		driver.manage().window().maximize();

		Sign_Up_with_Valid_Email_and_Password sign = new Sign_Up_with_Valid_Email_and_Password();
		sign.Sign_Up_Edge(driver);

		driver.quit();
	}

	@Test
	public void navigate_to_Sign_Up_with_Valid_Email_and_Password_chrome() {

		// chromeDrive
		WebDriverManager.chromedriver().setup();

		// Initialize chromeDriver
		driver = new ChromeDriver();

		driver.navigate().to("https://utasks-main.web.app/signup");
		driver.manage().window().maximize();

		Sign_Up_with_Valid_Email_and_Password sign = new Sign_Up_with_Valid_Email_and_Password();
		sign.Sign_Up_Edge(driver);

		driver.quit();
	}

	@AfterTest
	public void close() {
//		driver.close();
	}
}
