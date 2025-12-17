import java.util.Scanner;

public class LettersCounting{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter words: ");
		String words = input.nextLine();

		System.out.printf("The number of letters is %d%n", countLetters(words));

	}


	public static int countLetters (String words){

		int letterCount = 0;

		for (int counter = 0; counter < s.length(); counter++){

			if (Character.isLetter(s.charAt(counter)) == true){

				letterCount++;
			}

		}

		return letterCount;

	}


}