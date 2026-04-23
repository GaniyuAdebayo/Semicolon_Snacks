import java.util.Scanner;

public class LargestNumber{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter integer 1: ");
		int firstNumber = input.nextInt();

		int largest = firstNumber;


		for (int counter = 2; counter <= 10; counter++){

			System.out.printf("Enter integer %d: ", counter);
			firstNumber = input.nextInt();

			if ( firstNumber > largest)
				largest = firstNumber;

}
		System.out.printf("The largest number is %d and the last number inputed is %d%n", largest, firstNumber);
}


}