package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import UTasks.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Add_New_Task_to_a_newly_created_project_Setup {

	WebDriver driver;

	@Test
	public void Add_New_Task_to_a_newly_created_project_Edge() {

		// Edge Driver
		WebDriverManager.edgedriver().setup();

		// Initialize Edge Driver
		driver = new EdgeDriver();

		driver.navigate().to("https://utasks-main.web.app/login");
		driver.manage().window().maximize();

		Add_New_Task_to_a_newly_created_project add = new Add_New_Task_to_a_newly_created_project();
		add.Add_New_Task(driver);

		driver.quit();
	}

	@Test
	public void Add_New_Task_to_a_newly_created_project_firefox() {

		// FirefoxDriver
		WebDriverManager.firefoxdriver().setup();

		// Initialize FirefoxDriver
		driver = new FirefoxDriver();

		driver.navigate().to("https://utasks-main.web.app/login");
		driver.manage().window().maximize();

		Add_New_Task_to_a_newly_created_project add = new Add_New_Task_to_a_newly_created_project();
		add.Add_New_Task(driver);

		driver.quit();
	}

	@Test
	public void Add_New_Task_to_a_newly_created_project_chrome() {

		// chromeDrive
		WebDriverManager.chromedriver().setup();

		// Initialize chromeDriver
		driver = new ChromeDriver();

		driver.navigate().to("https://utasks-main.web.app/login");
		driver.manage().window().maximize();

		Add_New_Task_to_a_newly_created_project add = new Add_New_Task_to_a_newly_created_project();
		add.Add_New_Task(driver);

		driver.quit();
	}

	@AfterTest
	public void close() {
//		driver.close();
	}
}
