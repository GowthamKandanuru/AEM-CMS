package cms.aem.sites.components;

import org.testng.annotations.*;

import Interactions.Featured_Content;

public class Featured_Content_TC {
	
	Featured_Content featuredcontent;
	
	@BeforeTest
	public void init()
	{
		featuredcontent = new Featured_Content();
	}
	
	@Test
	public void verifyFeaturedComponent()
	{
		featuredcontent.create_template();
		featuredcontent.verifyComponent();
	}

}
