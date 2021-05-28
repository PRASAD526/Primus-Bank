package aprial_10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanceObject {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","d:/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://primusbank.qedgetech.com/");
	Thread.sleep(5000);
	driver.findElement(By.id("txtuId")).clear();
	driver.findElement(By.name("txtPword")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@id='login']")).click();
	driver.findElement(By.xpath("//a[@href='admin_banker_master.aspx']//img")).click();
	String strTitle=driver.getTitle();
	System.out.println("pageTitle::"+strTitle.length());
	String strUrl=driver.getCurrentUrl();
	System.out.println("urlis::"+strUrl);
	System.out.println("urlis::"+strUrl.length());
	Thread.sleep(5000);
	driver.quit();

	}

}
