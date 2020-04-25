package cms.aem.assets;

import org.testng.annotations.*;

import Interactions.Episode_Fragment;
import Utilities.BaseClass;

public class Episode_Fragment_TC extends BaseClass{
	
	Episode_Fragment episode;
	
	@BeforeTest
	public void init()
	{
		episode = new Episode_Fragment();
	}
	
	@Test
	public void episodeFragment()
	{
		logger = extent.createTest("Verification of Episode fragment");
		episode.createEpisode();
	}

}
