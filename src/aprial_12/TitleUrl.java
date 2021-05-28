package aprial_12;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class TitleUrl {

	public static void main(String[] args) {
//Html browser
		WebDriver driver=new HtmlUnitDriver();
		driver.get("https://google.com");
		String strTitle=driver.getTitle();
		System.out.println("page title::"+strTitle);
		System.out.println("page title length::"+strTitle.length());
		//print title and lenth of file
		String strUrl=driver.getCurrentUrl();
		System.out.println("Url is::"+strUrl);
		System.out.println("Url length is::"+strUrl.length());
		
	}

}
