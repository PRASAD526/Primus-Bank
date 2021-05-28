package aprial26;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {

	public static void main(String[] args)throws Throwable {
		System.setProperty("window.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location='https://amazon.in'");
driver.manage().window().maximize();
Thread.sleep(5000);
String pagetitle=js.executeScript("return document.title").toString();
System.out.println("page title::"+pagetitle);
System.out.println("page title length::"+pagetitle.length());
String strUrl=js.executeScript("return document.URL").toString();
System.out.println("Current Url::"+strUrl);
System.out.println("Current Url::"+strUrl.length());
String strdomain=js.executeScript("return.document.domain").toString();
System.out.println("Domain name::"+strdomain);
System.out.println("Domain length"+strdomain.length());
driver.close();
	}

}

