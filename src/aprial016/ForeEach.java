package aprial016;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForeEach {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement>links=driver.findElements(By.tagName("a"));
		System.out.println("no of links::"+links.size());
		Thread.sleep(5000);
		for(WebElement each: links)get;
		{
			System.out.println(each.getText());
			System.out.println(each.getAttribute("href"));
		}
		
	}

}
