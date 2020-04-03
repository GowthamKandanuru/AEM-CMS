package cms.aem.sites.webplex;

import org.testng.annotations.*;

import Interactions.Show_Hub_Template;
import Utilities.BaseClass;


public class Show_Hub_Template_TC extends BaseClass {
	
	Show_Hub_Template showtemplate;

	@BeforeTest
	public void init()
	{
		showtemplate = new Show_Hub_Template();
	}
	
	@Test
	public void templateCreation()
	{
		logger=extent.createTest("Verify showhub page Template");
		showtemplate.create_template();
		
	}

}
