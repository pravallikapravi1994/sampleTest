package StepDefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Loginsteps {


	WebDriver driver =null;
	Loginpage log= new Loginpage(driver);


	@Given("User is in Signin page")
	public void user_is_in_Signin_page() {
		System.out.println("User is in log in page");
		String projectpath =System.getProperty("user.dir");
		System.out.println("ProjectPath" +projectpath);
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		driver.navigate().to("http://example.testproject.io/web/");
		log.LoginValidUser("Test", "Password");
	}

	@And("User enters vaild pravallikasample@gmail.com and Test@{int}")
	public void user_enters_vaild_pravallikasample_gmail_com_and_Test(Integer int1) {
	
		System.out.println("User is in log in page");
	}

	@When("Clicks on SignIn button")
	public void clicks_on_SignIn_button() {
	
		System.out.println("User is in log in page");
	}

	@Then("User should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		System.out.println("User is in log in page");
	}




}
