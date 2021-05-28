package aprial20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionofItems {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cleartrip.com/flights");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.name("origin")).sendKeys("hyd");
Thread.sleep(5000);
List<WebElement>Olist=driver.findElements(By.xpath("/html/body/u/[1]/li/a"));
System.out.println("no of items are::"+Olist.size());
for(WebElement each:Olist)
{
	System.out.println(each.getText());
Thread.sleep(5000);
driver.close();
}


}
	}


