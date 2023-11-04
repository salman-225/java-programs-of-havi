package AssessmentTest;

import java.util.Scanner;

public class PerimeterofRectangle {
	public static int perimeterofRectangle(int l,int w) 
	{
		int pr=l+w;
	    int vv=2*pr;
	    return vv;
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);//2(l+w) formula for perimeter of rectangle
		System.out.println("Enter the length of rectangle");
		int length=scan.nextInt();
		System.out.println("Enter the width of rectangle");
		int width=scan.nextInt();
		 int result=perimeterofRectangle(length,width);
		 System.out.println(result);	
	}
}
