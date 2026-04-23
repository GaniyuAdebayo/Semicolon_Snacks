import java.util.Scanner;
import java.lang.Math;

public class PowerOperation{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input your number: ");
		double number = input.nextDouble();

		double square = Math.pow(number, 2);
		double cube = Math.pow(number, 3);

		System.out.printf("The square and cube of %.2f is %.2f and %.2f respectively %n", number, square, cube);

}


}