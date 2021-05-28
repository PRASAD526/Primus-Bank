package aprial14;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class HeightWidth {

	public static void main(String[] args) throws Throwable{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "d:/chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.get("http://primusbank.qedgetech.com/");
Thread.sleep(5000);
WebElement username=driver.findElementById("txtuId");
Dimension dim=username.getSize();
System.out.println("height::"+dim.getHeight()+""+"width::"+dim.getHeight());
WebElement loginbtn=driver.findElementByName("login");
Dimension dim1=loginbtn.getSize();
System.out.println("height::"+dim1.getHeight()+""+"width::"+dim1.getHeight());
driver.close();

	}

}
