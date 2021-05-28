package aprial16;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class Webpage {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("http://primusbank.qedgetech.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
List<WebElement>links=driver.findElements(By.tagName("a"));
System.out.println("no of links are::"+links.size());
Thread.sleep(5000);
for(int i=0;i<links.size();i++)
{
	String linkname=links.get(i).getText();
	String linkurl=links.get(i).getAttribute("href");
	Thread.sleep(5000);
	System.out.println(linkname+"\n"+linkurl);
}
Thread.sleep(5000);
driver.close();
	
}
	}


