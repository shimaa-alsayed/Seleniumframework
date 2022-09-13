package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PageBaseClass {

	protected WebDriver driver ; 
	public JavascriptExecutor jse;
	public Select select ;
	public Actions action;
	
	public PageBaseClass (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	protected static void Clickbutton(WebElement button)
	
	{
		button.click();
	}

	protected static void settextelementtext (WebElement textElement , String value)
	
	{
		textElement.sendKeys(value);
		
	}
	
	
public  void scrollbottom ()
	
	{
		jse.executeScript("scrollBy(0,2500)");
	}
	
}
