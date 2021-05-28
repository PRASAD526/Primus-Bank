package aprial28;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFile1 {

	public static void main(String[] args)throws Throwable {
	File f =new File("d:/primus.txt");
	FileWriter fw=new FileWriter(f);
	BufferedWriter bw=new BufferedWriter(fw);
	System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://primusbank.qedgetech.com/");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	String para1=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[1]")).getText();
	String para2=driver.findElement(By.xpath("//tbody/tr[2]/td[1]/p[2]")).getText();
	bw.write(para1);
	bw.newLine();
	bw.newLine();
	bw.write(para2);
	bw.flush();
	driver.close();
	}
	
	}


