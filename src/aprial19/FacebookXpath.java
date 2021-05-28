package aprial19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookXpath {

	public static void main(String[] args) throws Throwable{
		System.setProperty("webdriver.chrome.driver","d:/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
driver.manage().window().maximize();
Thread.sleep(5000);
driver.findElement(By.xpath("(//a[starts-with(@id,'u_0')])[3]")).click();
Thread.sleep(5000);
driver.findElement(By.xpath("//form[@id='reg']//following::input[2]")).sendKeys("Testinng");
driver.findElement(By.xpath("//form[@id='reg']//following::input[3]")).sendKeys("Selenium");
driver.findElement(By.xpath("//form[@id='reg']//following::input[4]")).sendKeys("Testing@gmail.com");
driver.findElement(By.xpath("//form[@id='reg']//following::input[5]")).sendKeys("Testing@gmail.com");
driver.findElement(By.xpath("//form[@id='reg']//following::input[6]")).sendKeys("testing6543");
new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[1]"))).selectByIndex(10);
Thread.sleep(3000);
new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[2]"))).selectByIndex(1);
Thread.sleep(3000);
new Select(driver.findElement(By.xpath("//form[@id='reg']//following::select[3]"))).selectByIndex(40);
Thread.sleep(3000);
driver.findElement(By.xpath("//input[@type='radio' and @value='2']")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("(//form[@id='reg']//following::button)[1]")).click();


	}

}
