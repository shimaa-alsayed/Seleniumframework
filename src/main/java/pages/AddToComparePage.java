package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddToComparePage extends PageBaseClass{

	public AddToComparePage(WebDriver driver) {
		super(driver);
	}
		@FindBy(xpath  = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[3]/td[2]/a")	
		public WebElement productnamecomparelist ;
		
		
		@FindBy(xpath   = "/html/body/div[6]/div[3]/div/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]/button")	
		 WebElement removeproductfromcomparelist ;
		
		// You have no items to compare.

		@FindBy(css  = "div.no-data")	
		public WebElement vrifiymassegeremoveproductfromcomparelist ;
		
		
		public void removefromcomparelist () 



		{
			Clickbutton(removeproductfromcomparelist);
		}


	
	}


