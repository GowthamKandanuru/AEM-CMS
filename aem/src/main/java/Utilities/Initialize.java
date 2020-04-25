package Utilities;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import pageObjects.*;


public class Initialize   {
	
	public   PropertyFile properties;
	public static  WebDriver driver;
	public   WebDriverWait wait;
	public   CreateButton cb;
	public   HomePageTemplate hp;
	public   ShowHubTemplate sh;
	public  static JavascriptExecutor js;
	public   FeaturedContent fc;
	public   FranchiseFragment franchise;
	public   EpisodeFragment episode;

	public Initialize() {
		
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,1000);
		cb = PageFactory.initElements(driver,CreateButton.class);
		hp = PageFactory.initElements(driver,HomePageTemplate.class);
		sh = PageFactory.initElements(driver,ShowHubTemplate.class);
		fc=  PageFactory.initElements(driver,FeaturedContent.class);
		franchise = PageFactory.initElements(driver,FranchiseFragment.class);
		episode = PageFactory.initElements(driver,EpisodeFragment.class);
		js = (JavascriptExecutor)driver;
	}

	@SuppressWarnings("static-access")
	public void fragmentCreation()
	{
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		driver.get(properties.getUrl());
        driver.manage().window().maximize();
        wait.until(ExpectedConditions.elementToBeClickable(franchise.assets)).click();
        wait.until(ExpectedConditions.elementToBeClickable(franchise.files)).click();
        franchise.via.click();
        franchise.folder.click();
        franchise.create.click();
        franchise.contentfragment.click();
	}
}
