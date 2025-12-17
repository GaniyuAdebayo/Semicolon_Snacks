import java.util.Scanner;

public class TwoLargestNumber{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter number: ");
		int numb1 = input.nextInt();
		System.out.println("Enter number: ");
		int numb2 = input.nextInt();

		int largest = numb1;
		int secondLargest = numb2;

		if (secondLargest > largest){

			secondLargest = numb1;
			largest = numb2;
		}
		
		for (int counter = 3; counter <= 10; counter++){

			System.out.println("Enter number: ");
			int numb = input.nextInt();

			if(numb > largest){
				secondLargest = largest;
				largest = numb;}
			else if (numb > secondLargest && numb < largest){
				secondLargest = numb;}

		}

		System.out.printf("Largest number is %d, while second largest is %d%n", largest, secondLargest);
	}
}