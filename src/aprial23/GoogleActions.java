package aprial23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleActions {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();
Thread.sleep(5000);
Actions ac=new Actions(driver);
driver.findElement(By.name("q")).sendKeys("selenium openings");
Thread.sleep(5000);
ac.sendKeys(Keys.ARROW_DOWN).build().perform();
Thread.sleep(5000);
ac.sendKeys(Keys.ARROW_DOWN).build().perform();
Thread.sleep(5000);
ac.sendKeys(Keys.ARROW_DOWN).build().perform();
ac.sendKeys(Keys.ENTER).perform();

	}

}
