package aprial23;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.google.common.base.Throwables;

public class DifferentActions {

	public static void main(String[] args)throws Throwable{
		System.setProperty("webdriver.chrome.drvier", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
Actions ac=new Actions(driver);
ac.sendKeys(Keys.ESCAPE).perform();
ac.moveToElement(driver.findElement(By.xpath("(//div[@class='xtXmba'])[5]")));
ac.perform();
Thread.sleep(5000);
ac.moveToElement(driver.findElement(By.linkText("All")));
ac.build().perform();
Thread.sleep(5000);
ac.moveToElement(driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"))).click();
ac.build().perform();
Thread.sleep(5000);
ac.moveToElement(driver.findElement(By.linkText("Mouse")));
ac.click().perform();
Thread.sleep(5000);
ac.moveToElement(driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[5]")));ac.perform();
Thread.sleep(5000);
ac.moveToElement(driver.findElement(By.linkText("Outdoor Toys")));
ac.click().perform();
Thread.sleep(5000);
driver.close();
	}

	}


