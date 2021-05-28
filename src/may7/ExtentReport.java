package may7;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
public class ExtentReport {
ExtentReports report;
ExtentTest test;
@BeforeTest
public void generateReport()
{
	report = new ExtentReports("./extentReport/Demo.html");
}
@Test
public void passTest()
{
	test=report.startTest("Test case pass");
	test.assignAuthor("prasad");
	test.log(LogStatus.PASS, "My test case pass");
}
@Test
public void failtest()
{
	test=report.startTest("Test case fail");
	test.assignAuthor("Prasad");
	test.log(LogStatus.FAIL, "My test case fail");
}
@Test
public void skiptest()
{
	test=report.startTest("test case fail");
	test.assignAuthor("Prasad");
	test.log(LogStatus.SKIP, "My test case pending");
}
@AfterMethod
public void tearDown()
{
	report.endTest(test);
	report.flush();
}
}

