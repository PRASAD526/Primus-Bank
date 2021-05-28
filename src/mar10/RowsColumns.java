package mar10;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsColumns {

	public static void main(String[] args)throws Throwable {
FileInputStream fi=new FileInputStream("d://sample.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fi);
XSSFSheet ws=wb.getSheet("login");
XSSFRow row=ws.getRow(0);
int colcount=row.getLastCellNum();
int rowcount=ws.getLastRowNum();
System.out.println("no of rows in login sheet::"+rowcount+""+"no of cells in first row::"+colcount);
	}

}
