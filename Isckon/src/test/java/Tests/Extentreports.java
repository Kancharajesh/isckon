package Tests;

import org.aspectj.lang.annotation.After;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.reporters.HtmlHelper;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Extentreports {

	ExtentHtmlReporter htmlReporter;
	ExtentReports extent;

	@BeforeSuite
	public void reportsetup() {

        htmlReporter = new ExtentHtmlReporter("extent.html");
        
        // create ExtentReports and attach reporter(s)
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
	}

	@AfterSuite
	public void reportteardown() 
	{

		extent.flush();
		
	}

}
