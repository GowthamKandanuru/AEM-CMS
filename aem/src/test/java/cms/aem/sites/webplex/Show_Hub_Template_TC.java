package cms.aem.sites.webplex;

import org.testng.annotations.*;

import Interactions.Show_Hub_Template;


public class Show_Hub_Template_TC {
	
	Show_Hub_Template showtemplate;
	
	@BeforeTest
	public void init()
	{
		showtemplate = new Show_Hub_Template();
	}
	
	@Test
	public void templateCreation()
	{
		showtemplate.create_template();
	}

}
