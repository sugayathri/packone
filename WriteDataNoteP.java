package packone;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteDataNoteP {
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("C:\\Users\\Rakesh\\Documents\\432.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("hello world");
		bw.newLine();
		bw.write("hi selenium");
		bw.close();
		
	}

}
