package UTasks;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Add_New_Task_to_already_existing_project {

	public void Add_New_Task(WebDriver driver) {

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try {

			// Login to UTasks

			Thread.sleep(500);

			// Insert Email
			By Email_Text = By.xpath("//*[@id=\"email\"]/input");
			driver.findElement(Email_Text).click();
			driver.findElement(Email_Text).sendKeys("utask3@test.com");

			Thread.sleep(200);

			// Insert password
			By password = By.xpath("//*[@id=\"password\"]/input");
			driver.findElement(password).sendKeys("test1234");

			// Click on Login Button
			By Login_BTN = By.xpath("//*[@id=\"root\"]/div/div/div/div[1]/div/form/button");
			driver.findElement(Login_BTN).click();

			Thread.sleep(4000);

			// Click on Project Name
			By Project_Name = By.className("sidebar__project-name");
			driver.findElement(Project_Name).click();

			Thread.sleep(300);

			// Click on Add Task
			By Add_Task = By.className("add-task__text");
			driver.findElement(Add_Task).click();

			Thread.sleep(300);

			// Insert Task Name
			By Task_name_text = By.className("add-task__content");
			driver.findElement(Task_name_text).sendKeys("test_Task");

			Thread.sleep(400);

			// Select Date
			By Task_Date = By.className("add-task__date");
			driver.findElement(Task_Date).click();

			Thread.sleep(1300);

			By Today = By.xpath("//*[@id=\"root\"]/div/main/section/div[2]/div/div[2]/div/ul/li[1]/div");
			driver.findElement(Today).click();

			Thread.sleep(1000);

			// Click on Add Task Button
			By Add_Task_BTN = By.className("add-task__submit");
			driver.findElement(Add_Task_BTN).click();

			Thread.sleep(300);

			// Show today's tasks
			By Next_7_days = By.xpath("//*[@id=\"root\"]/div/main/section/div[1]/ul[1]/li[2]/div");
			driver.findElement(Next_7_days).click();

			System.out.println("A New Task is added to already existing project and seated its due date to be Today. ");

		} catch (InterruptedException ex) {
			Logger.getLogger(Add_New_Task_to_already_existing_project.class.getName()).log(Level.SEVERE, null, ex);
		}

	}

}
