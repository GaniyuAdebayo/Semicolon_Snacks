import java.util.Scanner;

public class Temperature{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input temperature in Kelvin: ");
		double tempKelvin = input.nextDouble();

		double tempCelcius = tempKelvin - 273.15;

		double tempFahrenheit = tempCelcius * 9/5 + 32;

		System.out.printf("Kelvin: %.2f%nCelsius: %.2f%nFahrenheit: %.2f%n", tempKelvin, tempCelcius, tempFahrenheit);


}



}