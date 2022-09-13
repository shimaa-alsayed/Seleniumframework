package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddProductReviewPage extends PageBaseClass{

	public AddProductReviewPage(WebDriver driver) {
		super(driver);
	}
	@FindBy(id = "AddProductReview_Title")	
	 WebElement reviewtitletxt ;
		
	 @FindBy(id = "AddProductReview_ReviewText")	
	 WebElement reviewtexttxt ;	
	 
	
	 @FindBy(id  = "addproductrating_4")	
	 WebElement rattingbutton ;	
	 
	 @FindBy(xpath  = "//*[@id=\"review-form\"]/form/div[2]/button")	
	 WebElement submitreviewbutton ;
	 
	 

	 @FindBy(css = "div.result")	
	 public WebElement resultaddreview ;	
	
	public void productreview ( String ReviewTitle   , String    ReviewText  ) 
	{
	  settextelementtext(reviewtitletxt, ReviewTitle);
	  settextelementtext(reviewtexttxt, ReviewText);
      Clickbutton(rattingbutton);
      Clickbutton(submitreviewbutton);

	}
}
