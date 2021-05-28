package aprial_012;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import com.google.common.base.Throwables;

//import sleep.ThreadSleeep;

public class UrlMatching {

	public static void main(String[] args) throws Throwable{
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://google.com");
String ExpectedTitle="google";
String actualTitle=driver.getTitle();
if(actualTitle.equalsIgnoreCase(ExpectedTitle))
{
	System.out.println("Title is matching::"+ExpectedTitle+actualTitle);
}
else
{
	System.out.println("Title is notmatching::"+ExpectedTitle+actualTitle);

}
driver.close();
	}

		
	}

		
	



