package files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
	public static void main(String[] args) throws IOException {

		try {
			File myFile = new File("C:\\Users\\SalmanSultanMD\\eclipse-workspace\\salman\\trading");
			myFile.mkdir();

		//	myFile.createNewFile();
//			PrintWriter p=new PrintWriter(myFile);
//			p.println("havi");
//			p.println("solutions");
//			p.flush();
//			p.close();
//			FileWriter fw=new FileWriter(myFile);
//			fw.write("hi");
//	        fw.write("solutions");
//	        fw.write("ltd");
//	        
//	        fw.flush();
//	        fw.close();
//	        FileReader f=new FileReader(myFile);
//	        int c=f.read();
//	        while(c!=-1) {
//	        	System.out.print((char)c);
//	        	c=f.read();
	      //  }
	        
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}
