package aprial_09;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriver {

	public static void main(String[] args) {
//WebDriver
		System.setProperty("webdriver.chrome.driver", "d:\\chromedriver.exe");
ChromeDriver driver= new ChromeDriver();
System.setProperty("webdriver.gecko.driver", "d:/geckodriver.exe");
WebDriver dr=new FirefoxDriver();
	}
}
