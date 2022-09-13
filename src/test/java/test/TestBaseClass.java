package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class TestBaseClass extends AbstractTestNGCucumberTests{

	public static WebDriver driver ;	

	@BeforeSuite
	@Parameters({"browser"})
	public void startdriver (@Optional("chrome") String browsername)

	{
		if(browsername.equalsIgnoreCase("chrome"))

		{

			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/drivers/chromedriver.exe") ;
			driver = new ChromeDriver();
		}

		else if(browsername.equalsIgnoreCase("firefox"))

		{

			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/drivers/geckodriver.exe") ;
			driver = new FirefoxDriver();
		}

		else if(browsername.equalsIgnoreCase("Edge"))

		{

			System.setProperty("webdriver.edge.driver",System.getProperty("user.dir") + "/drivers/msedgedriver.exe") ;
			driver = new EdgeDriver();
		}


		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120,TimeUnit.SECONDS);
		driver.navigate().to("https://demo.nopcommerce.com/");
	}
	@AfterTest
	public void stopdriver ()

	{
		driver.quit();
	}



	


}
