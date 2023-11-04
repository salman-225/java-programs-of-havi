package programs;

import java.util.Scanner;

public class StringPalindrome {
	public static void main(String[] args) {
	Scanner scan =new Scanner (System.in);
	System.out.println("Enter the word");
	String data1= scan.nextLine();
	String data2="";
	for (int i = data1.length()-1; i >=0; i--) {
		char ch= data1.charAt(i);
		data2= data2+ch;
	}
	System.out.println(data2);
	if(data1.equalsIgnoreCase(data2))
	{
		System.out.println("The given String is Palindrone");
	}
	else
	{
		System.out.println("the given String is not Palindrone");
	}
	
	}

}
