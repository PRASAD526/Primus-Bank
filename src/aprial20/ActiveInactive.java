package aprial20;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiveInactive {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://www.cleartrip.com/flights");
driver.manage().window().maximize();
Thread.sleep(5000);
WebElement checkbox=driver.findElement(By.id("RoundTrip"));
Boolean value=checkbox.isSelected();
System.out.println(value);
checkbox.click();
	}

}
