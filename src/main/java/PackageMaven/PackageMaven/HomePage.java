package PackageMaven.PackageMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 

{
WebDriver driver;
@FindBy(xpath="//span[@class='nav-line-2 ']")
private WebElement accountsandlist;

@FindBy(xpath="//span[@class='nav-action-inner']")
private WebElement signin;

//Step 2
public void hoveroveronAccountList(WebDriver driver)
{
Actions a1=new Actions(driver);
a1.moveToElement(accountsandlist).perform();
	}
public void signinfromHomePage()
{
	signin.click();
}
//step3
public HomePage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}