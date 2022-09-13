package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePageClass extends PageBaseClass{

	public HomePageClass(WebDriver driver) {
		super(driver);
		jse = (JavascriptExecutor)driver;
		action = new Actions (driver);
		
	}
	
	@FindBy(linkText = "Register" )
	WebElement RegisterationLink ;
	
	
	@FindBy(linkText = "Log in" )
	WebElement loginLink ;
	
	@FindBy(xpath = "/html/body/div[6]/div[4]/div[1]/div[1]/ul/li[6]/a" )
	WebElement contactuslink ;
	
	@FindBy(id = "customerCurrency" )
	WebElement currencydropdownlist ; // 
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[3]/a/span[1]" )
	WebElement getwishlistfrommenubar ;
	
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/a" )
	WebElement computerhovermenue ;
	
	@FindBy(xpath = "/html/body/div[6]/div[2]/ul[1]/li[1]/ul/li[2]/a" )
	WebElement notebookmenuhoverelement ;

public void OpenRegisterationPage () 
{
	
	Clickbutton(RegisterationLink);


}

public void OpenLoginPage () 
{
	
	Clickbutton(loginLink);


}

public void Opencontactuspage () 
{
	
scrollbottom();
Clickbutton(contactuslink);

}
public void changecurrencydropdownelements () 
{
	

select = new Select (currencydropdownlist);
select.selectByIndex(1);
}
public void hovermenue () 
{
	action.moveToElement(computerhovermenue).moveToElement(notebookmenuhoverelement).click().build().perform();
}



public void getwishlistmenuelementsfrombar ()

{
	Clickbutton(getwishlistfrommenubar);

}



}