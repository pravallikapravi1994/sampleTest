package StepDefinitions;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class exmpsteps {
	
	
	WebDriver driver =null;
	Loginpage log= new Loginpage(driver);

	@Given("Enter data and Sigin")
	public void enter_data_and_Sigin() {
		
System.out.println("LoginDEMo POm");
		
		String projectpath =System.getProperty("user.dir");
		System.out.println("ProjectPath" +projectpath);
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    
		driver.navigate().to("example.testproject.io/web/");
		log.LoginValidUser("Test", "12345");
	}

	@When("I check for the <value> in step")
	public void i_check_for_the_value_in_step() {
	 
	}

	@Then("I verify the <status> in step")
	public void i_verify_the_status_in_step() {
	  
	}
}
