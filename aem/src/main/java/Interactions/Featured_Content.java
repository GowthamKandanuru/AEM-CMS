package Interactions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import Utilities.Basic;
import pageObjects.CreateButton;


public class Featured_Content extends Basic{
	
	public void create_template()
	{                             
		driver.get(properties.getUrl());
        driver.manage().window().maximize();
        cb = PageFactory.initElements(driver,CreateButton.class);
        wait.until(ExpectedConditions.elementToBeClickable(cb.sites)).click();
        cb.via.click();
        cb.paramount.click();
        wait.until(ExpectedConditions.elementToBeClickable(cb.folder)).click();
        cb.create.click();
        sh.page.click();
        js.executeScript("arguments[0].scrollIntoView();",sh.showhub);
        sh.showhub.click();
        sh.next.click();
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
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
        System.out.println(parentwindow);
        //sh.insert.click();
	}
	
	public void verifyComponent()
	{
		fc.manual.click();
		fc.fullscreen.click();
		wait.until(ExpectedConditions.elementToBeClickable(fc.Image_16_9)).click();
		wait.until(ExpectedConditions.elementToBeClickable(fc.Image_16_9)).sendKeys("/content/dam/gsp/entertainment-assets/test-image/06.jpg");
		fc.title.sendKeys("FairyTales");
		fc.description.sendKeys("Description");
		wait.until(ExpectedConditions.elementToBeClickable(fc.Image_2_3)).click();
		wait.until(ExpectedConditions.visibilityOf(fc.Image_2_3)).sendKeys("/content/dam/gsp/entertainment-assets/test-image/09.jpg");
		fc.Dynamic.click();
		Actions a= new Actions(driver);
		a.moveToElement(fc.submit).click().build().perform();
		System.out.println(fc.border.getText());
		String s = driver.getCurrentUrl();
		String s1 = s.replaceAll("/editor.html","");
		System.out.println(s1.replace("html","model.json"));
		driver.quit();
		/*sh.config_fc.click();
		sh.insert.click();*/
	}
}
