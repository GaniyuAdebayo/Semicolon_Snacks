import java.util.Scanner;
public class TaskThree{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
	
		int [] studentScores = new int [10];

		for (int count = 0; count < studentScores.length; count++){
			System.out.printf("Enter score %d: ", (count + 1));
			studentScores[count] = input.nextInt();
		}

		for (int count = 0; count < studentScores.length; count++){
			System.out.printf("%d ", studentScores[count]);

		}
		System.out.println();
		
	}

}