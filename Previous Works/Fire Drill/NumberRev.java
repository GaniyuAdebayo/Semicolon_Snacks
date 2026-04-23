import java.util.Scanner;
public class NumberRev{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a number: ");
		int number = input.nextInt();

		int sum = 0;

		while (number != 0){

			int number1 = number % 10;
			sum += number1;
			number = number/10;

			System.out.print(number1);



		}
		System.out.printf("The sum of the digits is %d%n", sum);

}


}