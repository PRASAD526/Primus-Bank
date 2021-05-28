package may03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleWindows {
	WebDriver driver;
	@Test(invocationCount=5)
	public void validationlogin()throws Throwable
	{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		driver=new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("http://orangehrm.qedgetech.com/");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.name("Submit")).sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		String expected="dashboard";
		String actual=driver.getCurrentUrl();
		if(actual.contains(expected))
		{
			Reporter.log("login sucess::"+expected+""+actual,true);
		}
		else
		{
			Reporter.log("login fail::"+expected+""+actual,true);

		}
driver.close();
	}

}
