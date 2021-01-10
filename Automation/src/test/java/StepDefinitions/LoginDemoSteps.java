package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class LoginDemoSteps {
//
//WebDriver driver=null;
//
//	@Given("User is in Gmail Page")
//	public void user_is_in_Gmail_Page() {
//		System.out.println("Gmail Test");
//		
//		String projectpath =System.getProperty("user.dir");
//		System.out.println("ProjectPath" +projectpath);
//		
//		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
//		driver= new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		
//	}
//	
//
//	@And("^User enters vaild (.*) and (.*) for Gmail Account$")
//	public void user_enters_vaild_pravallikasample_gmail_com_and_Test_for_Gmail_Account(String Username, String Password) throws InterruptedException
//	
//	{
//		driver.navigate().to("https://example.testproject.io/web/");
//		Thread.sleep(1000);
//		driver.findElement(By.id("name")).sendKeys(Username);
//		Thread.sleep(1000);
//		driver.findElement(By.id("password")).sendKeys(Password);
//		Thread.sleep(1000);
//		
//	}
//
//	@When("Clicks on SignIn button for gmail")
//	public void clicks_on_SignIn_button_for_gmail() throws InterruptedException {
//		driver.findElement(By.id("login")).click();
//		Thread.sleep(2000);
//	}
//
//	@Then("User should be logged in successfully to gmail")
//	public void user_should_be_logged_in_successfully_to_gmail() {
//		driver.findElement(By.id("logout")).isDisplayed();
//		
//		driver.close();
//		driver.quit();
//	}
//
//


}
