package aprial27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable1 {

	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://money.rediff.com/mutual-funds");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	WebElement table=driver.findElement(By.className("dataTable"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	int row=rows.size()-1;
	System.out.println("no of rows are::"+row);
	for(int i=1;i<row;i++)
	{
		List<WebElement>cols=rows.get(i).findElements(By.tagName("td"));
		System.out.println("rows no:::"+i+""+"column no in each row::"+cols.size());
	}
	Thread.sleep(5000);
	driver.close();
	}
	}


