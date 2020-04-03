package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import pageObjects.CreateButton;
import pageObjects.FeaturedContent;
import pageObjects.HomePageTemplate;
import pageObjects.ShowHubTemplate;

public class Basic {
	
	public  static PropertyFile properties;
	public  static WebDriver driver;
	public  static WebDriverWait wait;
	public  static CreateButton cb;
	public  static HomePageTemplate hp;
	public  static ShowHubTemplate sh;
	public  static JavascriptExecutor js;
	public  static FeaturedContent fc;

	public Basic() {
		
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,1000);
		cb = PageFactory.initElements(driver,CreateButton.class);
		hp = PageFactory.initElements(driver,HomePageTemplate.class);
		sh = PageFactory.initElements(driver,ShowHubTemplate.class);
		fc=  PageFactory.initElements(driver,FeaturedContent.class);
		js = (JavascriptExecutor)driver;
		
	}

}
