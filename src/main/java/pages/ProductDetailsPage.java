package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends PageBaseClass{

	public ProductDetailsPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(css = "strong.current-item")
	 public WebElement productnamebreadCrmb ;
	
	
	@FindBy(xpath  = "//*[@id=\"product-details-form\"]/div[2]/div[1]/div[2]/div[10]/div[3]/button")
	 public WebElement linkofbuttonemailafriend ;
	
	@FindBy(xpath  = "//*[@id=\"price-value-4\"]")
	 public WebElement productprice ;
	
	@FindBy(linkText  = "Add your review")
	  WebElement productreviewlinkbutton ; 
	
	@FindBy(id = "add-to-wishlist-button-4")
	 public WebElement addtowishlistbutton ;
	// 
	
	@FindBy(xpath = "//*[@id=\"bar-notification\"]/div/p/a")
	 public WebElement wishlistmenubutton ;
	
	
	@FindBy(css  = "button.button-2.add-to-compare-list-button")
	  WebElement addtocomparelistbutton ;  // //*[@id="bar-notification"]/div/p/a
	
	@FindBy(xpath  = "//*[@id=\"bar-notification\"]/div/p/a")
	  WebElement addtocomparelistmenue ;  
	
	@FindBy(id  = "add-to-cart-button-4")
	  WebElement addtocartbutton ; 
	
	
	
public void openemailfriendbutton ()
	
{
	
  Clickbutton(linkofbuttonemailafriend);
}
 


public void reviewbuttonlink ()

{
	
  Clickbutton(productreviewlinkbutton);
}

public void addandnavigatetowishlist ()

{
	
  Clickbutton(addtowishlistbutton);
  
  Clickbutton(wishlistmenubutton);
}

public void addtocomparelist ()

{
	
  Clickbutton(addtocomparelistbutton);
  Clickbutton(addtocomparelistmenue);
}

public void addtocart ()

{
	
  Clickbutton(addtocartbutton);
  
}





}
