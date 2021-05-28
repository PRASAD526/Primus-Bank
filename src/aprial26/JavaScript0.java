package aprial26;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript0 {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//create object for javascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//launch url
		js.executeScript("window.location='https://amazon.in'");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//print current page title and length of title
		String pagetitle= js.executeScript("return document.title").toString();
		System.out.println("Page title::"+pagetitle);
		System.out.println("Page title length ::"+pagetitle.length());
		//print current page url and length of url
		String strurl=js.executeScript("return document.URL").toString();
		System.out.println("Curerent url::"+strurl);
		System.out.println("Curerent url lenght::"+strurl.length());
		//print domain name
		String strdomain=js.executeScript("return document.domain").toString();
		System.out.println("Domain name::"+strdomain);
		System.out.println("Domain lenght::"+strdomain.length());
driver.close();
	}
	}


