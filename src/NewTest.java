import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@BeforeTest
	public void Setup() throws Throwable{
	driver = new ChromeDriver();
	Thread.sleep(5000);
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	Reporter.log("running set up is",true);
	}
  @Test
  public void Pbanking() throws Throwable{
  driver.findElement(By.xpath("//a[contains(@href,'personal')]")).click();
  Thread.sleep(5000);
  Reporter.log("Executing pbanking testcase",true);
}
@Test
public void Cbanking() throws Throwable{
	driver.findElement(By.xpath("//a[@href='Corporate Banking.html']//img")).click();
	Thread.sleep(5000);
	Reporter.log("Executing Cbanking Testcase",true);
}
@Test	
  public void Ibanking()throws Throwable {
	  driver.findElement(By.xpath("//a[@href='International Banking.html']//img9*******")).click();
		Thread.sleep(5000);
}
		@AfterTest
		public void tearDown() {
			driver.close();
			Reporter.log("Running teardown",true);
		}
}
  

