package mar10;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite {

	public static void main(String[] args) throws Throwable {
FileInputStream fi=new FileInputStream("d://sample.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fi);
XSSFSheet ws=wb.getSheet("login");
XSSFRow row=ws.getRow(5);
int rowcount=ws.getLastRowNum();
System.out.println("no of rows::"+rowcount);
XSSFCell c1=row.getCell(0);
XSSFCell c2=row.getCell(1);
String user=c1.getStringCellValue();
String pass=c2.getStringCellValue();
System.out.println(user+""+pass);
fi.close();
wb.close();
	}

}
