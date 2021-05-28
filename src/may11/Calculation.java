package may11;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Calculation {
WebDriver driver;
Workbook wb;
Sheet ws;
Row row;
FileInputStream fi;
FileOutputStream fo;
@BeforeTest
public void setUp()throws Throwable
{
	System.setProperty("webdriver.chrome.driver","d:/chromedriver.exe");
driver=new ChromeDriver();
}
@Test
public void verifypercentage()throws Throwable
{
	fi=new FileInputStream("d://calculation.xlsx");
	wb=WorkbookFactory.create(fi);
	ws=wb.getSheetAt(0);
	int rowCount=ws.getLastRowNum();
	Reporter.log("no of rows are::"+rowCount,true);
		for(int i=1;i<=rowCount;i++)
		{
			driver.manage().window().maximize();
			driver.get("https://www.calculator.net/percent-calculator.html");
			Thread.sleep(5000);
			if(wb.getSheet("calculation").getRow(i).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata1=(int)wb.getSheet("calculation").getRow(i).getCell(1).getNumericCellValue();
			String percentage=String.valueOf(celldata1);
			if(wb.getSheet("calculation").getRow(0).getCell(1).getCellType()==Cell.CELL_TYPE_NUMERIC)
			{
				int celldata2=(int)wb.getSheet("calculation").getRow(0).getCell(1).getNumericCellValue();
				String amount=String.valueOf(celldata2);
				driver.findElement(By.name("cpar1")).sendKeys(percentage);
				Thread.sleep(5000);
				driver.findElement(By.name("cpar2")).sendKeys(amount);
				Thread.sleep(5000);
				driver.findElement(By.xpath("//body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[2]/td[1]/input[2]")).click();
				Thread.sleep(5000);
				String interest=driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/input[3]")).getText();
				ws.getRow(i).createCell(2).setCellValue(interest);
				Reporter.log(percentage+"     "+amount+"    "+interest,true);
			}
			}
		}
		fi.close();
		fo=new FileOutputStream("D://calculationResult.xlsx");
		wb.write(fo);
		fo.close();
		wb.close();
}
@AfterTest
public void tearDown()
{
	driver.close();
				
			}
					
			
			}
		




