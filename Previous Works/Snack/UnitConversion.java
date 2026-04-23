

import java.util.Scanner;
public class UnitConversion{
	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input distance in km: ");
		double distance = input.nextDouble();

		double distanceMiles = distance * 0.621371;

		System.out.printf("%f km = %f miles%n", distance, distanceMiles);

}


}