package packone;

import java.io.FileOutputStream;

import jxl.Workbook;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class WritePgm {

	public static void main(String[] args) throws Exception {
		FileOutputStream fo=new FileOutputStream("C:\\Users\\Rakesh\\Desktop\\output.xls");
WritableWorkbook wwb=Workbook.createWorkbook(fo);
		WritableSheet ws=wwb.createSheet("result1", 0);
		int a=30;
		int b=50;
		int c=a*b;
		jxl.write.Label l=new jxl.write.Label(0, 0, "c value is:" +c);
		ws.addCell(l);
		wwb.write();
		wwb.close();
		
		
	}

}
