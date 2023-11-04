package AssessmentTest2;

import java.util.Scanner;

public class ReverseString11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter the String");
		String s=scan.next();
		s.concat("hi");
		String m=s.toUpperCase();
		System.out.println(m);
//		for (int i=s.length()-1; i>=0;i--)
//		{
//			char ch=s.charAt(i);
//			System.out.print(ch);
//		}
	}

}
