
import java.util.Scanner;
import java.util.Arrays;
public class StudentScores{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		System.out.println("Enter a score (0 to end it): ");
		int number = input.nextInt();
		
		while (number != 0){
			System.out.println("Enter a score (0 to end it): ");
			number = input.nextInt();
		}

	}

	public static void temperatureConverterTable(int number){

		System.out.printf("%-15s%-15s%n", "Temp (deg.C)", "Temp(deg.F)");

		for (int count = 0; count <= number; count++){
			double fahrenheitTemperature = (1.8 * count) + 32;

			System.out.printf("%8d%15.2f%n", count, fahrenheitTemperature);

		}

	}

	public static int numberFactorial(int number){
		
		int response = 1;

		for (int count = number; count >= 1; count--){
			response *= count;
		}

		return response;

	}

	public static int numberCombination(int firstNumber, int secondNumber){

		if (secondNumber > firstNumber){
			throw new IllegalArgumentException("first number must be greater than second number");
		}
		else if (firstNumber > 9){
			throw new IllegalArgumentException("first number must be below 10");
			
		}

		else if (firstNumber <=0 || secondNumber <= 0){
			throw new IllegalArgumentException("numbers must be greater than 0");

		}

		return numberFactorial(firstNumber)/(numberFactorial(secondNumber) * numberFactorial(firstNumber - secondNumber));

	}

	public static String lettersAtEvenPositions(String word){
		word = word.trim();

		String newWord = "";

		for (int index = 0; index < word.length(); index++){

			if ((index + 1) % 2 == 0){

				String letter = word.charAt(index) + "";

				if (!(letter.equals(" "))){
					newWord += letter;
				}
			}

		}

		return newWord;

	}

	public static int [] vowelConsonantCount(String word){
		word = word.trim().toLowerCase();
		int vowelCount = 0;
		int consonantCount = 0;

		for (int index = 0; index < word.length(); index++){
			char letter = word.charAt(index);
			if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
				vowelCount++;
			}
			else{
				consonantCount++;
			}

		}

		return new int [] {vowelCount, consonantCount};

	}

}