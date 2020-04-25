package Interactions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Utilities.Initialize;
import pageObjects.CreateButton;
import org.openqa.selenium.support.ui.WebDriverWait;

import Config.PropertyFile;
import pageObjects.CreateButton;


public class Show_Hub_Template extends Initialize {
	
	public void create_template()
	{                             
		driver.get(properties.getUrl());
        driver.manage().window().maximize();
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
       /* sh.insert.click();
        sh.config_fc.click();
        sh.configure.click();*/
	}
}
