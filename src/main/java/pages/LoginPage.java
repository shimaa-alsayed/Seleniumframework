package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageBaseClass {

	public LoginPage(WebDriver driver) {
		super(driver);
	}

 @FindBy(id = "Email")	
 WebElement emailtxt ;
	
 @FindBy(id = "Password")	
 WebElement passwordtxtbox ;	
 
 @FindBy(xpath  = "/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")	
 WebElement loginbutton ;	
	


public void userlogin (String email , String Password)



{
	
settextelementtext(emailtxt, email);
settextelementtext(passwordtxtbox, Password);
Clickbutton(loginbutton);




}

}

