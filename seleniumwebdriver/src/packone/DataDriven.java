//reading only first row if we don't use while loop
package packone;

import java.io.BufferedReader;
import java.io.FileReader;

public class DataDriven {

	private static BufferedReader b;

	public static void main(String[] args) throws Exception{
		
		
FileReader f=new FileReader("C:\\Users\\Rakesh\\Documents\\datadriveninnotepad.txt");
b = new BufferedReader(f);
//System.out.println(b.readLine());
String s;
//reads all data in notepad
while((s=b.readLine())!=null)
	
{
	String[] c=s.split("");
	//reads 3rd column
	System.out.println(c[2]);
	//System.out.println(s);
}
	}

}
