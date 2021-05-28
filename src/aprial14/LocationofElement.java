package aprial14;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocationofElement {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://google.com");
driver.manage().window().maximize();
Thread.sleep(5000);
WebElement searchtextbox=driver.findElement(By.name("q"));
Point obj=searchtextbox.getLocation();
System.out.println("x coordintaes::"+obj.getX()+""+"y coordinates::"+obj.getY());
searchtextbox.sendKeys("selenium openings in hyderabad");
Thread.sleep(5000);
driver.findElement(By.xpath(""))
	}

}
