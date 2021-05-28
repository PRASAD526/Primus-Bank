package aprial26;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript2 {

	public static void main(String[] args)throws Throwable {
		System.setProperty("window.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("window.location='https://www.amazon.in'");
driver.manage().window().maximize();
Thread.sleep(5000);
js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
Thread.sleep(5000);
js.executeScript("window.scrollBy(0,600)");
Thread.sleep(5000);
js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
Thread.sleep(5000);
WebElement signbtn=driver.findElement(By.xpath("(//span[text()='Sign in'])[3]"));
js.executeScript("window.scrollIntoView",signbtn);
Thread.sleep(5000);
signbtn.click();

	}

}
