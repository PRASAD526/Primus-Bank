package aprial14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowseScript {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.navigate().to("https://google.com");
	driver.manage().window().maximize();
	System.out.println("PageTitle[1]"+driver.getTitle());
	Thread.sleep(5000);
	driver.findElement(By.partialLinkText("Gm")).click();
	System.out.println("PageTitle[2]"+driver.getTitle());
	Thread.sleep(5000);
	driver.navigate().back();
	System.out.println("PageTitle[3]"+driver.getTitle());
Thread.sleep(5000);
driver.navigate().forward();
System.out.println("PageTitle[4]"+driver.getTitle());
Thread.sleep(5000);
driver.navigate().refresh();
Thread.sleep(5000);
driver.close();



	}

}
