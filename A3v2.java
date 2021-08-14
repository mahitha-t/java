package v2;
import java.util.Scanner;
public class A3v2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		System.out.println("Enter temp in fahrenheit: ");
		double fahrenheitTemp= input.nextDouble();
		double kelvinTemp= ( (fahrenheitTemp - 32) / 1.8 ) + 273;
		System.out.println(fahrenheitTemp + " in kelvin is "+ kelvinTemp );
	}

}
