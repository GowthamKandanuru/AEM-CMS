package cms.aem.sites.webplex;

import org.testng.annotations.*;

import Interactions.Home_Page_Template;
import Utilities.BaseClass;


public class Home_Page_Template_TC extends BaseClass {	
	
	Home_Page_Template ht;
	
	@BeforeTest
	public void init()
	{
		ht = new Home_Page_Template();
	}
	
	@Test
	public void createTemplate()
	{
		ht.createHometemplate();
		logger = extent.createTest("craetion of Home page Template","testing creation of home page template");
	}
}
