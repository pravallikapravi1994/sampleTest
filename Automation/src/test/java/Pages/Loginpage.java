package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Loginpage {
	
	public WebDriver driver;
	
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
		String url =driver.getCurrentUrl();
		System.out.println(url);
		driver.getTitle().equals("");
	}
	

	
	By Username = By.id("name");
	By Password = By.id("password");
	By loginbuttton= By.id("login");
	By logout= By.id("logout");
	
	public void LoginValidUser(String username, String password)
	{
		driver.findElement(Username).sendKeys(username);
		driver.findElement(Password).sendKeys(password);
		
		driver.findElement(loginbuttton).click();
	}
	
	
	public void VerifyLogoutbutton()
	{
		driver.findElement(logout).isDisplayed();
	}


}
