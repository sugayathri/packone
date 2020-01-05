package packone;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class FomExcel {

	public static void main(String[] args) throws Exception {
	//importing fileinputstream to identify location of excel
		FileInputStream f=new FileInputStream("C:\\Users\\Rakesh\\Desktop\\seleniumwebdriver\\data.xls");
		//opening identified workbook
		Workbook wb=Workbook.getWorkbook(f);
		//opening sheet in a opened workbook
		Sheet s=wb.getSheet("Sheet1");
		//identifying cell in a sheet and read data from cell
		System.out.println(s.getCell(3,1).getContents());
		System.out.println(s.getCell("A4").getContents());

	}

}
