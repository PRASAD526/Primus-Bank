package mar10;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class RowsColmns {

	public static void main(String[] args)throws Throwable {
FileInputStream fi=new FileInputStream("d://sample.xlsx");
XSSFWorkbook wb=new XSSFWorkbook(fi);
XSSFSheet ws=wb.getSheet("login");
System.out.println("no of rows in a sheet"+rowcount);
for(int i=1;i<=rowcount;i++)
{
	String username=ws.getRow(i).getCell(0).getStringCellValue();
	String password=ws.getRow(i).getCell(1).getStringCellValue();
	System.out.println(username+""+password);
	ws.getRow(i).createCell(2).setCellValue("pass");
}
fi.close();
FileOutputStream fo=new FileOutputStream("e://results.xlsx");
wb.write(fo);
fo.close();
wb.close();
}
	}


