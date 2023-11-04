package AssessmentTest2;

import java.util.Scanner;

public class AreaofCylinder29 {
	public  static double cylinderArea(double radius,double height)
	{
		double hr=(height+radius);
		double result=2*3.14*radius*hr;//2*pi*r(h+r)
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan =new Scanner (System.in);
		System.out.println("Enter the radius");
		double radius=scan.nextDouble();
		System.out.println("Enter the height");
		double height=scan.nextDouble();
		System.out.println("the area of cylinder is :"+cylinderArea(radius,height));
		
	
		
	}

}
