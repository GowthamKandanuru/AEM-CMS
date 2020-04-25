package Interactions;

import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import Utilities.Initialize;


public class Episode_Fragment extends Initialize {
	
	Initialize i;
	
	public Episode_Fragment()
	{
		i = new Initialize();
	}
	
	@SuppressWarnings("static-access")
	public void createEpisode()
	{
		i.fragmentCreation();
		episode.Episodefg.click();
		episode.next.click();
		episode.systitle.sendKeys("Episode Fragment");
		episode.submit.click();
		episode.open.click();
		String parent = driver.getWindowHandle();
		Iterator<String> i =driver.getWindowHandles().iterator();
		while(i.hasNext())
		{
			driver.switchTo().window(i.next());
		}
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		episode.EpisodeTitle.sendKeys("Thugs of Hindustan Episode 1");
		episode.description.sendKeys("The First Episode");
		episode.shortdesc.sendKeys("This is first episodess");
	//	js.executeScript("arguments[0].scrollIntoView();",episode.production);
		episode.production.sendKeys("24");
	}

}
