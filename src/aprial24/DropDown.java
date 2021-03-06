package aprial24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://jqueryui.com/droppable/");
driver.manage().window().maximize();
Thread.sleep(5000);
Actions ac = new Actions(driver);
ac.sendKeys(Keys.PAGE_DOWN).perform();
List<WebElement>frames=driver.findElements(By.tagName("iframe"));
System.out.println("no of frames are::"+frames.size());
driver.switchTo().frame(0);
WebElement src=driver.findElement(By.id("droppable"));
WebElement dst=driver.findElement(By.id("droppable"));
ac.clickAndHold(src).moveToElement(dst).release().perform();
if(dst.getText().contains("Dropped!"))
{
	System.out.println("Drag and Drop success");
}
else
{
	System.out.println("Drop and Drop Fail");
}
Thread.sleep(5000);
driver.switchTo().defaultContent();
ac.moveToElement(driver.findElement(By.linkText("Button"))).click().perform();
Thread.sleep(5000);
driver.close();

}

	

}

