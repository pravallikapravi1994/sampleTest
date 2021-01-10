package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_PF


{
	
	WebDriver driver;

	public Login_PF(WebDriver Driver)
	{
		this.driver=Driver; 
		PageFactory.initElements(driver,Login_PF.class);
	}
	
	@FindBy(id="name")
	WebElement Username;
	
	@FindBy(id="password")
	WebElement Password;
	
	@FindBy(id="login")
	WebElement Login;
	
	
	public void login_EnterUsernamePassword(String Username1, String Password1)
	{
		Username.sendKeys(Username1);
		
		Password.sendKeys(Password1);
		
		Login.click();
	}
	
	public void verifyLogin()
	
	{
		
		
	}

}
