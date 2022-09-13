package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePageClass;

public class ProductHoverMenuTestCase extends TestBaseClass{

	HomePageClass homeObject;	
	
	@Test
	public void hoveroncomputermenue()
	
	{
		homeObject = new HomePageClass (driver);
		homeObject.hovermenue();
		Assert.assertTrue(driver.getCurrentUrl().contains("notebooks"));
	}
}
