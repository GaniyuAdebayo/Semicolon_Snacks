import java.util.InputMismatchException;
import java.util.Scanner;
public class MortgageCalculatorMethods{

	private static Scanner input = new Scanner (System.in);

	public static double principalCollection(){
		try{
			System.out.println("Enter the principal amount: ");
			double value = input.nextDouble();
			input.nextLine();
			return value;
		} catch (InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return principalCollection();

		}

	}

	public static double rateCollection(){
		try{
			System.out.println("Enter the annual interest rate: ");
			double value = input.nextDouble();
			input.nextLine();
			return value;
		} catch (InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return rateCollection();

		}

	}

	public static int yearsCollection(){
		try{
			System.out.println("Enter the duration in years: ");
			int value = input.nextInt();
			input.nextLine();
			return value;
		} catch (InputMismatchException e){
			System.out.println("Invalid input!");
			input.nextLine();
			return yearsCollection();

		}

	}

}