package PackageMaven.PackageMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
//step1
	WebDriver driver;
	@FindBy(id="email")
	private WebElement username;
	

	@FindBy(id="pass")
	private WebElement password;
	

	@FindBy(name="login")
	private WebElement login;

	@FindBy(xpath="(//div[@role='button' and contains(@aria-label,'Decline optional cookies')])[1]")
	private WebElement cookies;
	
	//step2
	public void un_valid()
	{
		username.sendKeys("anmol.arshiya@gmail.com");
	}
	public void cookies_accepting()
	{
		cookies.click();
	}
	public void pass_valid()
	{
		password.sendKeys("anmol@123");
	}
	public void login_button()
	{
		login.click();
	}
	//step 3
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
