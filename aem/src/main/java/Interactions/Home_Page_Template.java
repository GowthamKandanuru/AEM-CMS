package Interactions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import pageObjects.CreateButton;
import pageObjects.HomePageTemplate;

public class Home_Page_Template {
	
	private PropertyFile properties;
	private WebDriver driver;
	private WebDriverWait wait;
	private CreateButton cb;
	private HomePageTemplate hp;
	JavascriptExecutor js;
	
	public Home_Page_Template()
	{
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
		wait = new WebDriverWait(driver,1000);
		cb = PageFactory.initElements(driver,CreateButton.class);
		hp = PageFactory.initElements(driver,HomePageTemplate.class);
		js = (JavascriptExecutor)driver;
	}
	
	public void createHometemplate()
	{
		driver.get(properties.getUrl());
        driver.manage().window().maximize();
        cb = PageFactory.initElements(driver,CreateButton.class);
        wait.until(ExpectedConditions.elementToBeClickable(cb.sites)).click();
        cb.via.click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        cb.paramount.click();
        wait.until(ExpectedConditions.elementToBeClickable(cb.folder)).click();
        cb.create.click();
        hp.page.click();
        hp.homepage.click();
        hp.next.click();
        hp.title.sendKeys("Auomation_HomePage_Template");
        hp.prddropdown.click();
        hp.webplex.click();
        hp.create.click();
        hp.open.click();
        String parentwindow = driver.getWindowHandle();
        Iterator<String> i = driver.getWindowHandles().iterator();
        while(i.hasNext())
        {
        driver.switchTo().window((String) i.next());
        }
        wait.until(ExpectedConditions.elementToBeClickable(hp.superhero)).click();
        driver.switchTo().window(parentwindow);
        driver.close();
    }

	
	
}
