package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageFactory.Login_PF;
import io.cucumber.java.en.*;


public class LoginDemoStepsPOM {

WebDriver driver=null;
Login_PF login;


	@Given("User is in Gmail Page")
	public void user_is_in_Gmail_Page() {
		System.out.println("Gmail Test");
		
		String projectpath =System.getProperty("user.dir");
		System.out.println("ProjectPath" +projectpath);
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
	}
	

	@And("^User enters vaild (.*) and (.*) for Gmail Account$")
	public void user_enters_vaild_pravallikasample_gmail_com_and_Test_for_Gmail_Account(String Username, String Password) throws InterruptedException
	
	{
		driver.navigate().to("https://example.testproject.io/web/");
		

		//log.LoginValidUser(Username, Password);
		
	}

	@When("Clicks on SignIn button for gmail")
	public void clicks_on_SignIn_button_for_gmail() throws InterruptedException {
		
		
	}
	

	@Then("User should be logged in successfully to gmail")
	public void user_should_be_logged_in_successfully_to_gmail() {
		
		//log.VerifyLogoutbutton();
		
		driver.close();
		driver.quit();
	}




}
