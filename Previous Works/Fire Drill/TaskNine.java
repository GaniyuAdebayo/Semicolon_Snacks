import java.util.Scanner;

public class TaskNine{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		double sum = 0.0;

		for (int counter = 1; counter <= 10; ){
		
			System.out.printf("Enter score %d%n", counter);
			double score = input.nextDouble();
			if (score>=0.0 && score <= 100.0){
				
				sum += score;
			
			}
			counter++;
	
		}	

		System.out.printf("The sum of the valid scores between 1 and 100 is %.2f%n", sum);

	}

}