package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailPage extends PageBaseClass {

	public EmailPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "FriendEmail")
	 WebElement FriendEemail ;
	
	@FindBy(id = "PersonalMessage")
	 WebElement Personalmessage ;	
	
	@FindBy(xpath = "/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[2]/button")
	 WebElement sendemail ;	
	 @FindBy(css = "div.result")
public WebElement massegeemailsend ;
	
public void contactus(String emailfriend , String massegepersonal  )
	
	
	{
		
		settextelementtext(FriendEemail, emailfriend);
		settextelementtext(Personalmessage, massegepersonal);
		Clickbutton(sendemail);
	}	
	

	
}
