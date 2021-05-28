package aprial27;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable2 {


	public static void main(String[] args)throws Throwable {
		System.setProperty("webdriver.chrome.driver","d:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://money.rediff.com/mutual-funds");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		WebElement table=driver.findElement(By.className("dataTable"));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println("no of rows are::"+rows.size());
		Thread.sleep(5000);
		for(WebElement eachrow:rows)
		{
			List<WebElement>cols=eachrow.findElements(By.tagName("td"));
			for(WebElement eachcell:cols)
			{
				Thread.sleep(5000);
				String celltext=eachcell.getText();
		System.out.println("\n"+celltext);
			System.out.println();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		}
	}
			
			
		}
}
	


