package functinal_interface;

interface CalculateSquareofNumber{
	abstract int squareofnum(int x);
}

public class Functional_Interface {
	public static void main(String[] args) {
		CalculateSquareofNumber square= x-> x*x;
		int output= square.squareofnum(5);
		System.out.println(output);
		
	}

}
