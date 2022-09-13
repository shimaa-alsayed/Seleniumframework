package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends PageBaseClass{

	public MyAccountPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(linkText = "Change password")
	 WebElement changepassword ;


	public void openchangepasswordpage () 
	{
		
		Clickbutton(changepassword);
	}
	
	
	@FindBy(id = "OldPassword")
	 WebElement oldpasswordtxt ;
	
	@FindBy(id = "NewPassword")
	 WebElement newpasswordtxt ;
	
	 @FindBy(id = "ConfirmNewPassword")
	 WebElement confirmpasswordtxt ;
	
	
	 @FindBy(xpath = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/form/div[2]/button")
	 WebElement changepasswordbutton ;
	 
	 
	 @FindBy(xpath = "//*[@id=\"bar-notification\"]/div/span")
	 WebElement closesucessmassege ;
	 
	 
	
	public void changepassword (String oldpass, String  newpass) 
	{
		settextelementtext(oldpasswordtxt, oldpass);
		settextelementtext(newpasswordtxt, newpass);
		settextelementtext(confirmpasswordtxt, newpass);
		Clickbutton(changepasswordbutton);
		Clickbutton(closesucessmassege);
	}
	
	
}