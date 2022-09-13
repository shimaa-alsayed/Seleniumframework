package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends PageBaseClass{

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	
	@FindBy(id = "small-searchterms")
	 WebElement Searchtxtbox ;
	
	@FindBy(xpath  = "//*[@id=\"small-search-box-form\"]/button" )
	WebElement searchbutton ;
	
	@FindBy(id = "ui-id-1")	
	List<WebElement> ProductList ;
	

	@FindBy(linkText = "Apple MacBook Pro 13-inch")	
	 WebElement accesslinkproduct ;
	public void searchforproduct (String PrductName) throws InterruptedException  {
		
		

		settextelementtext(Searchtxtbox, PrductName);
		
		Clickbutton(searchbutton);

	}
	
public void openaccesslinkproduct ()  {
		
		
		Clickbutton(accesslinkproduct);
	
}

public void ProductsearchAutosuguest (String searchtxt)  {
	
	
  settextelementtext(Searchtxtbox, searchtxt);
  try {
	Thread.sleep(4000);
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
  ProductList.get(0).click();
}

}