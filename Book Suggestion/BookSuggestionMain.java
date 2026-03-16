import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BookSuggestionMain{

	public static void main (String [] args){

		Scanner input = new Scanner (System.in);

		ArrayList <String> library = new ArrayList<>(List.of("The Hobbit", "The Mystery", "Animal Farm", "Brave Kingdom"));

		String forward = "true";

		while (forward.equals("true")){

			String mainMenu = """
			

				Welcome to the Book Suggestion System!
				1. Get Suggestions
				2. Add Book
				3. Remove Book
				4. Update Book
				5. Show Books
				6. Exit

			""";

			System.out.println(mainMenu);

			int mainMenuOption = BookSuggestion.collectMenuChoice();

			switch (mainMenuOption){

				case 1:

					String continuity;
					do {
						System.out.println("Book of the Day: ");
						System.out.printf("	Book Title: %s%n", BookSuggestion.getRandomBook(library));
						System.out.printf("	Page: %d%n", BookSuggestion.getRandomPage());

						continuity = BookSuggestion.continuityValidation();
					}

					while (continuity.equals("yes"));
					break;
				
				case 2:
					
					System.out.println("Enter the book title: ");
					String response = input.nextLine();

					if (response.trim().length() > 0){

					BookSuggestion.addBooksToShelve(library, response);
						System.out.println("Book added successfully!");
					}

					else{
						System.out.println("No title added");
					}
					
					break;
				
				
				case 3:
					
					System.out.println("Enter the book title to remove: ");
					String book = input.nextLine();
					
					if (library.contains(book.toLowerCase().trim())){

						BookSuggestion.removeBook(library, book);

						System.out.println("Book removed successfully!");}

					else{
						System.out.printf("%s is not in the library%n", book);
					}
					break;
				
				case 4:
					System.out.println("Enter the old title: ");
					String oldTitle = input.nextLine().trim();

					if (library.contains(oldTitle.toLowerCase().trim())){
						System.out.println("Enter the new title: ");
						String newTitle = input.nextLine().trim();

						BookSuggestion.updateBooks(library, oldTitle, newTitle);
						System.out.printf("Book updated successfully!");
					}
	
					else{
						System.out.printf("%s is not in the library%n", oldTitle);}

				
					break;
				case 5:
					System.out.println("All Books");
					System.out.printf("%s ", BookSuggestion.outputBooksInShelve(library));
					break;
				

				case 6:

					forward = "false";
					break;

				default:
					System.out.println("Invalid number range, put between 1 - 6");
				
				
			}

		}
	}

}