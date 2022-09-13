package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UserRegisterationPage extends PageBaseClass{

	public UserRegisterationPage(WebDriver driver) {
		super(driver);
		
		
		
	}
	@FindBy(id = "gender-male" )
	WebElement genderbutton ;
	
	@FindBy(id = "FirstName" )
	WebElement firstnametxt ;
	
	@FindBy(id = "LastName" )
	WebElement lastnametxt ;
	
	@FindBy(id = "Email" )
	WebElement emailtxt ;
	
	@FindBy(id = "Password" )
	WebElement passwordtxt ;
	
	@FindBy(id = "ConfirmPassword" )
	WebElement confirmpassword ;
	
	@FindBy(id = "register-button" )
	WebElement Registerbutton ;

	@FindBy(css = "div.result" )
	public WebElement sucessmassege ;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a" )
	public WebElement logoutLink ;
	
	@FindBy(linkText = "My account")
	 WebElement MyAccountLink ;
	
public void userRegisteration (String FirstName , String LastName ,  String Email , String Password) 
{
	
	Clickbutton(genderbutton);
	settextelementtext(firstnametxt, FirstName);
	settextelementtext(lastnametxt,LastName);
	settextelementtext(emailtxt,Email);
	settextelementtext(passwordtxt,Password);
	settextelementtext(confirmpassword,Password);
    Clickbutton(Registerbutton);
}

public void userlogout () {
	
	
	Clickbutton(logoutLink);
}

public void openingmyaccountlink () {
	
	
	Clickbutton(MyAccountLink);
}




}







