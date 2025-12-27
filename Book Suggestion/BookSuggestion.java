import java.util.ArrayList;
import java.security.SecureRandom;


public class BookSuggestion{

	private static SecureRandom random = new SecureRandom();

	public static ArrayList <String> booksArchive(ArrayList <String> archive){

		for (Object book : archive){

			if (!(book instanceof String)){
				
				throw new RuntimeException("List of books contains non-string type");
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

	

	

}