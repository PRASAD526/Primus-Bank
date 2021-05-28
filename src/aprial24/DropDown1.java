package aprial24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown1 {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		Actions ac= new Actions(driver);
		driver.switchTo().frame(0);
		WebElement src=driver.findElement(By.id("droppable"));
		WebElement dst=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(src, dst).perform();
		
	

	}

}
