package AssessmentTest2;

import java.util.Scanner;

public class EvenLengthWords13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the String");
		String s=scan.nextLine();
		String [] s1=s.split(" ");
		
		for (int i=0; i<s1.length;i++)
		{
			if(s1[i].length()%2==0)
			{
				System.out.println(s1[i]);
			}
			

	}
	}
}
	
