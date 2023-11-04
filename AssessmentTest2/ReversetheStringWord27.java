package AssessmentTest2;

import java.util.Scanner;

public class ReversetheStringWord27 {
	public static void reverse(String s2)
	{
		for(int i=s2.length()-1;i>=0;i--)
		{
			char ch=s2.charAt(i);
			System.out.print(ch);
		}
		System.out.print(" ");
		
	}
	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the String ");
		String s=scan.nextLine();
		String [] s1=s.split(" ");
		for(int i=0;i<=s1.length-1;i++)
		{
			reverse(s1[i]);
		}	
	
	}

}
