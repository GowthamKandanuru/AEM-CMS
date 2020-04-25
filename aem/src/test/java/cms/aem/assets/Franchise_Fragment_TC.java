package cms.aem.assets;

import org.testng.annotations.*;

import Interactions.Franchise_Fragment;
import Utilities.BaseClass;

public class Franchise_Fragment_TC extends BaseClass{

	Franchise_Fragment f;
	
	@BeforeTest
	public void init()
	{
		f = new Franchise_Fragment();
	}
		
	@Test
	public void createFranchise()
	{
		logger = extent.createTest("Verification of Franchise fragment");
		f.createFranchise();
	}
	}

