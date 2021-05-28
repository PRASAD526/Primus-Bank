package apeial_11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstanceObject {

	public static void main(String[] args) {
//create instance object
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//launch url in browser
		driver.get("https://www.youtube.com/");
		//fill login form
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		driver.findElement(By.name("textPword")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='login']")).click();
	}

}
