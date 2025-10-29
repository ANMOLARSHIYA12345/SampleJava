package PackageMaven.PackageMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagee {
	WebDriver driver;
	
	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(id="continue")
	private WebElement continuebutton;
	

	@FindBy(id="ap_password")
	private WebElement password;
	
	@FindBy(name="signInSubmit")
	private WebElement signinbutton;
	


	//Step 2
	public void validUsername()
	{
		username.sendKeys("9632059297");
		}
	public void continuClick()
	{
		continuebutton.click();
	}
	public void validPassword()
	{
		password.sendKeys("Anmol13@Arshiya");
		}
	public void signInSubmit()
	{
		signinbutton.click();
		}
	
	
	
	//step3
	public LoginPagee(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
