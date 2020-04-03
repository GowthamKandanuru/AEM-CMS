package Utilities;

import org.testng.*;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.markuputils.*;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

@SuppressWarnings("deprecation")
public class ListenersClass implements ITestListener{

	ExtentHtmlReporter htmlreporter;
	ExtentReports extent;
	ExtentTest logger;
	
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName());
		/*htmlreporter = new ExtentHtmlReporter("C:/Users/hp/Desktop/Clones/AEM-CMS/aem/drivers/STMExtentReport.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("OS","Windows");
		System.out.println("findouttttttttt");
		extent.setSystemInfo("browser","firefox");
		htmlreporter.config().setDocumentTitle("tittllleee");
		htmlreporter.config().setReportName("reportnameeee");
		htmlreporter.config().setTheme(Theme.STANDARD);
		logger = extent.createTest("To verify Templates");*/
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName());
		//logger.log(Status.PASS, MarkupHelper.createLabel(result.getName()+" Test Case PASSED", ExtentColor.GREEN));	
	}

	
	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName());
		/*logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
		 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));*/
	}

	
	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName());
		//logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE));
	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
		//extent.flush();
	}

	
	public void onStart(ITestContext context) {
		
	}

	
	public void onFinish(ITestContext context) {

		
	}

}
