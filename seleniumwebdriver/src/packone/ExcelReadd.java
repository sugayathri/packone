package packone;

import java.io.FileInputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import jxl.Sheet;
import jxl.Workbook;

public class ExcelReadd {

	public static void main(String[] args) throws Exception{
		
		//importing fileinputstream to identify location of excel
		FileInputStream f=new FileInputStream("C:\\Users\\Rakesh\\Desktop\\heyhi.xls");
       //opening identified workbook
		Workbook wb=Workbook.getWorkbook(f);
		//opening sheet in a opened workbook
		Sheet s=wb.getSheet("Sheet1");
		WebDriver driver=new FirefoxDriver();
		
		//opening application by passing data from cell(column,row) in excel
	driver.get(s.getCell(0,0).getContents());
	System.out.println(s.getCell(0,0).getContents());
	driver.manage().window().maximize();
	//passing data into email and password 
	driver.findElement(By.id(s.getCell(0,1).getContents())).sendKeys(s.getCell(0, 2).getContents());
	System.out.println(s.getCell(0,1).getContents());
	
	driver.findElement(By.id(s.getCell(0,3).getContents())).sendKeys(s.getCell(0, 4).getContents());
	System.out.println(s.getCell(0,3).getContents());
	
	
	
	
	}
	

}
