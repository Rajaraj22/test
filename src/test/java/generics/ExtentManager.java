package generics;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

	public static ExtentSparkReporter htmlReporter;
	public static ExtentReports reports;
	public static ExtentTest test;

	@BeforeMethod
	public static void start() {

		htmlReporter = new ExtentSparkReporter("report.html");
		reports = new ExtentReports();

		reports.attachReporter(htmlReporter);
		
		
		

	}

}
