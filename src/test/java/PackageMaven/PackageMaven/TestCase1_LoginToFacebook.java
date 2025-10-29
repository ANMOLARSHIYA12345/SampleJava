package PackageMaven.PackageMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase1_LoginToFacebook {
@Test
public void withValidCred()
{
	WebDriver driver =new ChromeDriver();
	driver.get("https://facebook.com/");
	//driver.findElement(By.xpath("(//div[@role='button' and contains(@aria-label,'Decline optional cookies')])[1]")).click();
	driver.manage().window().maximize();
	LoginPage obj=new LoginPage(driver);
	obj.cookies_accepting();
	obj.un_valid();
	obj.pass_valid();
	obj.login_button();
	
	
}
}
