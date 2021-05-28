package testng2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testng2 {
	WebDriver driver;
	@BeforeTest
	public void setUp() throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).click();
		Reporter.log("Running Admin Login",true);
		Thread.sleep(5000);
	}
		@Test
		public void Admin()
		{
			driver.findElement(By.id("menu_admin_viewAdminModule")).click();
			Reporter.log("Executing Admin Test",true);
		}
		@Test
		public void pim()
		{
			driver.findElement(By.id("menu_pim_viewPimModule")).click();
			Reporter.log("Executing pim Testcase",true);
		}
		@Test
		public void leave()
		{
			driver.findElement(By.id("menu_leave_viewLeaveModule"
					+ "")).click();
			Reporter.log("Executing leave Testcase",true);
		}
		@AfterTest
		public void tearDown()throws Throwable
		{
			Thread.sleep(50000);
			driver.close();
			Reporter.log("running teardown",true);
		}
	}


