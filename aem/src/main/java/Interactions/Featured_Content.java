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
import pageObjects.FeaturedContent;
import pageObjects.ShowHubTemplate;

public class Featured_Content {
	
	private PropertyFile properties;
	private WebDriver driver;
	private WebDriverWait wait;
	private CreateButton cb;
	private ShowHubTemplate sh;
	private FeaturedContent fc;
	JavascriptExecutor js;
	
	public Featured_Content()
	{
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,1000);
        cb = PageFactory.initElements(driver,CreateButton.class);
        sh = PageFactory.initElements(driver,ShowHubTemplate.class);
        fc=  PageFactory.initElements(driver,FeaturedContent.class);
        js = (JavascriptExecutor)driver;
	}
	
	public void create_template()
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
        sh.page.click();
        js.executeScript("arguments[0].scrollIntoView();",sh.showhub);
        sh.showhub.click();
        sh.next.click();
        sh.title.sendKeys("Automate_Show_Hub_Tempalate");
        sh.prddropdown.click();
        sh.webplex.click();
        sh.create.click();
        sh.open.click();
        String parentwindow = driver.getWindowHandle();
        Iterator<String> i = driver.getWindowHandles().iterator();
        while(i.hasNext())
        {
        driver.switchTo().window((String) i.next());
        }
        wait.until(ExpectedConditions.elementToBeClickable(sh.add)).click();
        sh.config_fc.click();
        sh.configure.click();
        //sh.insert.click();
	}
	
	public void verifyComponent()
	{
		fc.manual.click();
		fc.Image_16_9.click();
		wait.until(ExpectedConditions.elementToBeClickable(fc.Image_16_9)).sendKeys("/content/dam/gsp/entertainment-assets/test-image/06.jpg");
		//js.executeScript("window.scrollBy(0,1000)");
		fc.title.sendKeys("FairyTales");
		fc.description.sendKeys("Description");
		wait.until(ExpectedConditions.elementToBeClickable(fc.Image_2_3)).click();
		wait.until(ExpectedConditions.visibilityOf(fc.Image_2_3)).sendKeys("/content/dam/gsp/entertainment-assets/test-image/09.jpg");
		wait.until(ExpectedConditions.elementToBeClickable(fc.submit)).click();
	}
}
