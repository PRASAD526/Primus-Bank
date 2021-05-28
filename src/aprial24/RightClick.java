package aprial24;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();
Thread.sleep(5000);
Actions ac=new Actions(driver);
ac.moveToElement(driver.findElement(By.linkText("Gmail"))).contextClick().perform();
Robot r= new Robot();
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_DOWN);
r.keyRelease(KeyEvent.VK_DOWN);
Thread.sleep(5000);
r.keyPress(KeyEvent.VK_ENTER);
Thread.sleep(5000);
ArrayList<String>brw=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(brw.get(1));
Thread.sleep(5000);
driver.findElement(By.xpath("(//a[contains(text(),'Sign in')])[2]")).click();
ArrayList<String>brw1=new ArrayList<String>(driver.getWindowHandles());
driver.switchTo().window(brw1.get(2));
Thread.sleep(5000);
driver.findElement(By.name("identifier")).sendKeys("prasadnaik16526@gmail.com");
Thread.sleep(5000);
driver.switchTo().window(brw.get(0));
Thread.sleep(5000);
driver.findElement(By.linkText("Images")).click();
Thread.sleep(9000);




driver.quit();



	}

}
