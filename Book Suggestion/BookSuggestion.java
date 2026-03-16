import java.util.ArrayList;
import java.security.SecureRandom;
import java.util.Scanner;
import java.util.InputMismatchException;


public class BookSuggestion{

	private static Scanner input = new Scanner (System.in);

	private static SecureRandom random = new SecureRandom();

	public static ArrayList <String> booksArchive(ArrayList <String> archive){

		for (String book : archive){

			if (!(book instanceof String)){
				
				throw new IllegalArgumentException("List of books contains non-string type");
			}
		}
		return archive;
	}

	public static String getRandomBook(ArrayList <String> archive){

		archive = booksArchive(archive);

		if (archive.isEmpty())
			return "No books available!";

		int location = random.nextInt(archive.size());
		return archive.get(location);

	}

	public static int getRandomPage(){

		return random.nextInt(100) + 1;

	}

	public static String outputBooksInShelve(ArrayList <String> archive){

		archive = booksArchive(archive);
		StringBuilder output = new StringBuilder();
		int counter = 1;

		for (String book : archive){

			output.append(String.format("%d. %s%n", counter, book));
			counter++;
		}

		return output.toString();
	}

	public static void addBooksToShelve(ArrayList <String> archive, String book){

		archive = booksArchive(archive);

		archive.add(book);
	
	}

	public static void removeBook(ArrayList <String> archive, String book){

		archive = booksArchive(archive);

		if (archive.contains(book)){

			archive.remove(book);
		}

		else

			System.out.printf("%s is not in the archive%n", book);
	}

	public static void updateBooks(ArrayList <String> archive, String oldBook, String newBook){

		archive = booksArchive(archive);

		int position = archive.indexOf(oldBook);

		archive.set(position, newBook);

	}

	public static int collectMenuChoice(){
		try{
			System.out.print("Enter Operation: ");
			int menuChoice = input.nextInt();
			input.nextLine();
			return menuChoice;
		} catch (InputMismatchException e){
			System.out.println("Invalid Input!");
			input.nextLine();
			return collectMenuChoice();
		}

	}

	public static String continuityValidation(){

		System.out.println("Would you like to get another suggestion?(yes/no)");
		String validation = input.nextLine().trim().toLowerCase();

		if (validation.equals("yes") || validation.equals("no")){
			return validation;
		}

		System.out.println("Invalid Input");
		return continuityValidation();
	}

	

	

}