package PackageMaven.PackageMaven;

import org.testng.annotations.Test;

public class LoginToAmazon  extends BaseClass{
	@Test
	
public void withValidCredentials() throws InterruptedException
{
	HomePage homepage=new HomePage(driver);
	homepage.hoveroveronAccountList(driver);
	Thread.sleep(3000);
	homepage.signinfromHomePage();
	Thread.sleep(3000);
	
	LoginPagee loginpage=new LoginPagee(driver);
	loginpage.validUsername();
	loginpage.continuClick();
	loginpage.validPassword();
	loginpage.signInSubmit();
	
			
}


}
