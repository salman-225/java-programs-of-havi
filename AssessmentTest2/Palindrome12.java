package AssessmentTest2;

import java.util.Scanner;

public class Palindrome12 {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		String s=scan.next();
		String s1=" ";
		for (int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			s1=s1+ch;
		}
		if(s.equalsIgnoreCase(s1))
		{
			System.out.println("the given string is palindrome");
		}
		else
		{
			System.out.println("the given string is  not palindrome");
		}
	}
}
