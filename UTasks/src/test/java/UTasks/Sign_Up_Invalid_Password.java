package UTasks;

import static org.testng.Assert.assertTrue;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Sign_Up_Invalid_Password {

	public void Sign_Up_Edge(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Sign Up to UTasks

			Thread.sleep(500);

			// Insert Email
			By Email_Text = By.xpath("//*[@id=\"email\"]/input");
			driver.findElement(Email_Text).click();
			driver.findElement(Email_Text).sendKeys("utask@test.com");

			Thread.sleep(500);

			// Insert password
			By password = By.xpath("//*[@id=\"password\"]/input");
			driver.findElement(password).sendKeys("test");

			Thread.sleep(500);

			// Insert Password Confirmation
			By Password_Confirmation = By.xpath("//*[@id=\"password-confirm\"]/input");
			driver.findElement(Password_Confirmation).sendKeys("test1234");

			Thread.sleep(500);

			// Click on Sign Up Button
			By Sign_Up_BTN = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/form/button");
			driver.findElement(Sign_Up_BTN).click();

			// Sign-Up Error Messages
			WebElement Message = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/div"));
			System.out.println(Message.getText());
			assertTrue(Message.getText().contains("Passwords do not match"));

		} catch (InterruptedException ex) {
			Logger.getLogger(Sign_Up_Invalid_Password.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
