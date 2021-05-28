package aprial27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://money.rediff.com/mutual-funds");
driver.manage().window().maximize();
Thread.sleep(5000);
String tabletext1=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[2]")).getText();
String tabletext2=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[5]/td[1]")).getText();
System.out.println(tabletext1+"\n"+tabletext2);
Thread.sleep(5000);
driver.close();
	}
	

	}


