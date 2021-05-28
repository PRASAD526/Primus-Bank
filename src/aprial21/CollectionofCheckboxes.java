package aprial21;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollectionofCheckboxes {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("file:///D:/checkbox_1.html");
driver.manage().window().maximize();
Thread.sleep(5000);
List<WebElement>checkboxes=driver.findElements(By.xpath("//input[@type='checkbox'"));
System.out.println("no of checkboxes are::"+checkboxes.size());
for(WebElement each:checkboxes)
{
	boolean value=each.isSelected();
	System.out.println(value);
	String checkboxname=each.getAttribute("value");
	System.out.println(checkboxname);
	if(value)
	{
		each.click();
	}
	else
	{
	each.click();
	}
	Thread.sleep(5000);
	driver.close();
}
	}

	}


