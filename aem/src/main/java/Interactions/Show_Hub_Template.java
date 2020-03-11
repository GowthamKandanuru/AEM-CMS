package Interactions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import PageObjects.CreateButton;
import PageObjects.ShowHubTemplate;

public class Show_Hub_Template {
	
	private PropertyFile properties;
	private WebDriver driver;
	private WebDriverWait wait;
	private CreateButton cb;
	private ShowHubTemplate sh;
	JavascriptExecutor js;
	
	public Show_Hub_Template() {
		
		properties = new PropertyFile();
		System.setProperty(properties.getDriver(),properties.getDriverPath());
		driver = new FirefoxDriver();
        wait = new WebDriverWait(driver,1000);
        cb = PageFactory.initElements(driver,CreateButton.class);
        sh = PageFactory.initElements(driver,ShowHubTemplate.class);
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
	}
}
