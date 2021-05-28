package aprial20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountingRadioButtons {

	public static void main(String[] args)throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cleartrip.com/flights");
driver.manage().window().maximize();
Thread.sleep(5000);
List<WebElement>radios=driver.findElements(By.xpath("//ul/li/label/strong"));
System.out.println("no of radio buttons"+radios.size());
for(WebElement each:radios)
{
	System.out.println(each.getText());
Thread.sleep(5000);
driver.close();
}

	}
}


