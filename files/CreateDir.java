package files;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class CreateDir {
	public static void main(String[] args) {
		
		try//for creating the folder
		{
			File myf = new File ("C:\\Users\\SalmanSultanMD\\eclipse-workspace\\salman");
			myf.mkdir();
			try // for creating the file
			{
				File h= new File("C:\\Users\\SalmanSultanMD\\eclipse-workspace\\salman\\data.txt");
				    h.createNewFile();
			
			  try {//for writing the file
				  FileWriter fw= new FileWriter (h);//  here we can give full path or obj ref var.
				  fw.write("havi Solutions\n");
				  fw.write("havi Solutions is great");
				  fw.close(); 
			  
			  try {
				 
				  
				  File j= new File ("data.txt");
				  Scanner sc= new Scanner(j);
				  while(sc.hasNext()) {
					  String line=sc.nextLine();
					  System.out.println(line);
				  }
				  sc.close();
			  }
			  
			catch(Exception r)
			{
				System.out.print("the file not created");
			}
				
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
			catch(Exception r)
			{
				System.out.print("the file not created");
			}
		}
			catch(Exception r)
			{
				System.out.print("the file not created");
			}
		finally
        {
			System.out.println("this is the End");
			
		}

}
}
