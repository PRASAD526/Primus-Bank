package aprial17;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Expected {

	public static void main(String[] args) throws Throwable{
String expecteditem="english";
boolean itemexist=false;
System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.navigate().to("https://www.google.com/");
Thread.sleep(5000);
//driver.findElement(By.xpath("//a[normalize-space()='Create New Account']")).click();
//Thread.sleep(5000);
Select dropdown=new Select(driver.findElement(By.id("")));
List<WebElement>Olist=dropdown.getOptions();
System.out.println("No of items are::"+Olist.size());
for(WebElement each:Olist)
{
	String actualitems=each.getText();
	Thread.sleep(5000);
	System.out.println(actualitems);
	if (actualitems.equalsIgnoreCase(expecteditem)) {
		itemexist=true;
		break;
		}
		
	}
if(itemexist)
{
	System.out.println("Item found in listbox::"+expecteditem);
}
else
{
	System.out.println("item not found in listbox::"+expecteditem);
	Thread.sleep(5000);
	driver.close();
}
	

	
	}

}
