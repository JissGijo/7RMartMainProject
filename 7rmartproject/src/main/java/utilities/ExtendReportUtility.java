package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {

	public static final ExtentReports extentReports = new ExtentReports();

	public synchronized static ExtentReports createExtentReports() {
		ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
		reporter.config().setReportName("7r Mart Project");
		extentReports.attachReporter(reporter);
		extentReports.setSystemInfo("Organisation", "Obsqura");
		extentReports.setSystemInfo("Name", "Jiss");
		return extentReports;

	}
}