package AssessmentTest2;

import java.util.Arrays;
import java.util.Scanner;

public class LargestandSmallestWord26 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=scan.nextLine();
		String [] s1=s.split(" ");
	     String lw=s1[0];
		  String sw=s1[0];
		for(int i=0;i<=s1.length-1;i++)
		{
			if(lw.length()<s1[i].length())
			{
				lw=s1[i];
			}
			if(sw.length()>s1[i].length())
			{
				sw=s1[i];
			}
		}
		System.out.println("the largest word is: "+lw);
		System.out.println("the smallest word is: "+sw);
		
			
	}
}

