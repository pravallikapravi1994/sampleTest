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

public class GoogleSearchSteps {
	
	WebDriver driver =null;
	Loginpage log= new Loginpage(driver);

	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("LoginDEMo POm");
		
		String projectpath =System.getProperty("user.dir");
		System.out.println("ProjectPath" +projectpath);
		
		System.setProperty("webdriver.chrome.driver", projectpath+"/src/test/resources/Drivers/chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("User is in on google search page")
	public void user_is_in_on_google_search_page() {
		
		driver.navigate().to("https://www.google.co.nz/");
		driver.findElement(By.name("q")).sendKeys("Automation Testing");
	    
	}

	@When("User Enters Testing Automation content")
	public void user_Enters_Testing_Automation_content() throws InterruptedException {
		Thread.sleep(2000);

	}

	@And("Hits Enter")
	public void hits_Enter() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
	    
	}

	@Then("User shoud be navigated to  Search results")
	public void user_shoud_be_navigated_to_Search_results() {
		driver.getPageSource().contains("Automation Testing Tutorial");
		driver.close();
		driver.quit();
	    
	}



	

}
