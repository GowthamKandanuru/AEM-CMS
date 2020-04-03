package cms.aem.sites.webplex;

import org.testng.annotations.*;

import Interactions.Home_Page_Template;
import Utilities.BaseClass;


public class Home_Page_Template_TC extends BaseClass {	
	
	Home_Page_Template hc;
	
	@BeforeTest
	public void init()
	{
		hc = new Home_Page_Template();
	}
	
	@Test
	public void createTemplate()
	{
		hc.createHometemplate();
		logger = extent.createTest("creation of Home page Template","testing creation of home page template");
	}
}
