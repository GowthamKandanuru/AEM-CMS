package Interactions;

import java.util.Iterator;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import Utilities.Initialize;

public class Franchise_Fragment extends Initialize {
	
	Initialize i;
	
	public Franchise_Fragment()
	{
		i = new Initialize();
	}

	@SuppressWarnings("static-access")
	public void createFranchise()
	{
		i.fragmentCreation();
		franchise.franchisefg.click();
		franchise.next.click();
		franchise.systitle.sendKeys("FranchiseFrament");
		Assert.assertTrue(franchise.systitle.getText().equals(franchise.name.getText()),"Title is not maching");
		franchise.submit.click();
		franchise.open.click();
		String parent = driver.getWindowHandle();
		Iterator<String> i =driver.getWindowHandles().iterator();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
		}
		System.out.println("Button enabled"+""+franchise.save.isEnabled());
		franchise.FranchiseTitle.sendKeys("EROS International");
		System.out.println("Button enabled"+""+franchise.save.isEnabled());
	}

}
