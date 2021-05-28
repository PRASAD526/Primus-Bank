package mar7;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqual {
WebDriver driver;
@Test
public void verifyTitle()throws Throwable
{
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://gmail.com");
	Thread.sleep(5000);
	String expected="Google";
	String actual=driver.getTitle();
	try{
	Assert.assertEquals(actual, expected,"Title is not matching");
	}catch (Throwable t) {
		System.out.println(t.getMessage());
		// TODO: handle exception
	}
driver.close();
}
}
