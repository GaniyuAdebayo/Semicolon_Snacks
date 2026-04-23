import java.util.Scanner;

public class GradeCounterValidation{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		int passGrade = 0;
		int failGrade = 0;

		for (int counter = 1; counter <= 10; counter++){

			System.out.println("Enter grade (1 for pass, 2 for fail): ");
			int grade = input.nextInt();

			while (grade != 1 && grade != 2){

				System.out.println("Wrong input!");
				System.out.println("Enter grade (1 for pass, 2 for fail): ");
				grade = input.nextInt();
			
			}

			if (grade == 1)
				passGrade++;
			else
				failGrade++;
		}

		System.out.printf("Number of Pass: %d%nNumber of Fail: %d%n", passGrade, failGrade);
	}
}