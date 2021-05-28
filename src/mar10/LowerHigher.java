package mar10;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LowerHigher {

	public static void main(String[] args) throws Throwable{
FileInputStream fi= new FileInputStream("d://sample.xlsx");
Workbook wb=WorkbookFactory.create(fi);
Sheet ws=wb.getSheetAt(0);
int rowcount=ws.getLastRowNum();
System.out.println("no of rows are::"+rowcount);
for(int i=1;i<=rowcount;i++)
{
Row row=ws.getRow(i);
Cell c1=row.getCell(0);
Cell c2=row.getCell(1);
String username=c1.getStringCellValue();
String password=c2.getStringCellValue();
System.out.println(username+""+password);
ws.getRow(i).createCell(2).setCellValue("im prasad");
}
fi.close();
FileOutputStream fo=new FileOutputStream("d://mrngresults.xls");
wb.write(fo);
fo.close();
wb.close();
}
	}


