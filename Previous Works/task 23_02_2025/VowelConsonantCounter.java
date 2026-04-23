import java.util.Scanner;
public class VowelConsonantCounter{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a sentence: ");
		String sentence = input.nextLine().toLowerCase();

		int vowelCounter = 0;
		int consonantCounter = 0;

		for (int index = 0; index < sentence.length(); index++){
			char letter = sentence.charAt(index);

			if ((letter >= 'A' && letter <= 'Z') || (letter >= 'a' && letter <= 'z')){
				

				if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
					vowelCounter++;
				}

				else{
					consonantCounter++;
				}
			}

		}

		System.out.printf("Number of consonants: %d%nNumber of Vowels: %d%n", consonantCounter, vowelCounter);

	}

}