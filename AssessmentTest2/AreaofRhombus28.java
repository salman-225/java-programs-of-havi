package AssessmentTest2;

import java.util.Scanner;

public class AreaofRhombus28 {
	public static double areaofrhombus(double n1,double n2)
	{
		double d=n1*n2;
		double result=d/2;
		return result;
	}
	public static void main(String[] args) {//diagonal1*diagonal2/2
	Scanner scan =new Scanner (System.in);
	System.out.println("Enter the  diagonal 1");
	double d1=scan.nextDouble();
	System.out.println("Enter the diagonal 2");
	double d2=scan.nextDouble();
	System.out.println("the Area of Rhombus of is :"+areaofrhombus(d1,d2));
	}
	

}
