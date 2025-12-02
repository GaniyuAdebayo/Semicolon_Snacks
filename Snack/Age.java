import java.util.Scanner;

public class Age{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Input your present age: ");
		int presentAge = input.nextInt();

		int ageNextYear = presentAge + 1;

		System.out.printf("Your present age is %d years, you will be %d years next year!%n", presentAge, ageNextYear);

}


}