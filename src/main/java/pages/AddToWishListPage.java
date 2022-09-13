package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToWishListPage extends PageBaseClass{

	public AddToWishListPage(WebDriver driver) {
		super(driver);
	}

	@FindBy(css  = "a.product-name")	
	public WebElement productnameinwishlist ;
	
	
	@FindBy(css  = "button.remove-btn")	
	 WebElement removeproductfromwishlist ;
	
	
	

	@FindBy(css  = "div.no-data")	
	public WebElement vrifiymassegeremoveproductfromwishlist ;
	
	
	public void removefromwishlist () 



	{
		Clickbutton(removeproductfromwishlist);
	}


	
	
}
