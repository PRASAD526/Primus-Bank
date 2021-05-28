package aprial21;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertMessage {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.name("proceed")).click();
String alertmessage=driver.switchTo().alert().getText();
System.out.println(alertmessage);
Thread.sleep(5000);
driver.switchTo().alert().accept();
Thread.sleep(5000);
driver.close();
	


}
}
