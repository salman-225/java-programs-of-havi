package AssessmentTest2;

import java.util.Scanner;

public class StringWithoutSpaces25 {
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=scan.nextLine();
		System.out.println(s);
		String [] s1 =s.split(" ");
		/*s=s.replace(" ", "");
		System.out.println(s);*/  // direct method
		
		for(int i=0;i<=s1.length-1;i++)  
		{
		  System.out.print(s1[i]);
		}
	}
}
