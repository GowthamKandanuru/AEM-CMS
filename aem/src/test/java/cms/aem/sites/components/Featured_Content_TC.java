package cms.aem.sites.components;


import org.testng.annotations.*;
import Interactions.Featured_Content;
import Utilities.BaseClass;

public class Featured_Content_TC extends BaseClass {
	
	Featured_Content featuredcontent;
	
	
	@BeforeTest
	public void init()
	{
		featuredcontent = new Featured_Content();
	}
	
	@Test
	public void validateComponent()
	{
		logger = extent.createTest("Verification of FeaturedContentcomponent");
		featuredcontent.create_template();	
		featuredcontent.verifyComponent();
	}
}
