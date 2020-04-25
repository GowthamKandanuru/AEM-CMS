package Interactions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.Initialize;
import pageObjects.CreateButton;


public class Home_Page_Template extends Initialize{
	
	public  void createHometemplate()
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
        hp.superhero.click();
    }	
}
