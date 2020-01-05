package packone;

import java.io.FileInputStream;

import jxl.Sheet;
import jxl.Workbook;

public class CountNoRows {

	public static void main(String[] args) throws Exception {
		FileInputStream filepath=new FileInputStream("C:\\Users\\Rakesh\\Desktop\\heyhi.xls");
		Workbook workbookobj=Workbook.getWorkbook(filepath);
		Sheet sheetref=workbookobj.getSheet("Sheet1");
   /*   //how to read data from rows 
		int r=sheetref.getRows();
int i;
for(i=0;i<r;i++)
{
	System.out.println(sheetref.getCell(0, i).getContents());
	
}


//how to read data from columns
int c=sheetref.getColumns();
int j;
for(j=0;j<c;j++)
{
	System.out.println(sheetref.getCell(j, 0).getContents());
}*/
	int i;
	int j;
	int c=sheetref.getColumns();
	int r=sheetref.getRows();
	for(i=0;i<c;i++)
	{
		for(j=0;j<r;j++)
		{
			
			String val=sheetref.getCell(i, j).getContents();
			if(val.equals("hello")==true)
				System.out.println(i + "_" +j);
			System.out.println(sheetref.getCell(i, j).getContents());
		}
	}
	
	}
	
	

}
