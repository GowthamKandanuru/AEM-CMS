package Utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class BaseClass {
	
	 @SuppressWarnings("deprecation")
	 public static  ExtentHtmlReporter htmlReporter;
	    public static ExtentReports extent;
	    public static ExtentTest logger;

	    @BeforeSuite
	    public void setUp()
	    {
	        htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/TestReport.html");
	        extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	         
	        extent.setSystemInfo("OS", "Windows");
	        extent.setSystemInfo("URL", "https://qa-cms.viacom.com");
	        extent.setSystemInfo("Environment", "QA");
	        extent.setSystemInfo("User Name", "kandanug");
	        htmlReporter.config().setDocumentTitle("AEM Test Report");
	        htmlReporter.config().setReportName("Regression Test");
	        htmlReporter.config().setTheme(Theme.DARK);
	    }
	     
	    @AfterMethod
	    public void getResult(ITestResult result)
	    {
	        if(result.getStatus() == ITestResult.FAILURE)
	        {
	            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName()+" Test case FAILED due to below issues:", ExtentColor.RED));
	            logger.fail(result.getThrowable());
	        }
	        else if(result.getStatus() == ITestResult.SUCCESS)
	        {
	        	logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));
	        }
	        else
	        {
	        	logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName()+" Test Case SKIPPED", ExtentColor.ORANGE));
	        	logger.skip(result.getThrowable());
	        }
	    }
	     
	    @AfterSuite
	    public void tearDown()
	    {
	        extent.flush();
	    }
	
}
