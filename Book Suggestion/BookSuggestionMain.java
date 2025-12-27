import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class BookSuggestionMain{

	public static void main (String [] args){

		//BookSuggestion myBooks = new BookSuggestion ();
		Scanner input = new Scanner (System.in);

		ArrayList <String> library = new ArrayList<>(List.of("The Hobbit", "The Mystery", "Animal Farm", "Brave Kingdom"));

		boolean forward = true;

		while (forward){

			String mainMenu = """
			

				Welcome to the Book Suggestion System!
				1. Get Suggestions
				2. Add Book
				3. Remove Book
				4. Update Book
				5. Show Books

			""";

			System.out.println(mainMenu);

			System.out.println("Enter Operation: ");

			int mainMenuOption = input.nextInt();

			input.nextLine();

			switch (mainMenuOption){

				case 1:{

					String continuity;
					do {
						System.out.println("Book of the Day: ");
						System.out.printf("	Book Title: %s%n", BookSuggestion.getRandomBook(library));
						System.out.printf("	Page: %d%n", BookSuggestion.getRandomPage());

						System.out.println("Would you like to get another suggestion?(yes/no)");
						continuity = input.nextLine().trim().toLowerCase();
					}

					while (continuity.equals("yes"));
					break;
				}
				case 2:{
					
					System.out.println("Enter the book title: ");
					String response = input.nextLine();

					BookSuggestion.addBooksToShelve(library, response);
					System.out.println("Book added successfully!");
					
					break;
				}
				
				case 3:{
					
					System.out.println("Enter the book title to remove: ");
					String book = input.nextLine();
					
					if (library.toLowerCase().contains(book.toLowerCase())){

						BookSuggestion.removeBook(library, book);

						System.out.println("Book removed successfully!");}

					else{
						System.out.printf("%s is not in the library%n", book);
					}
					break;
				}
				case 4:{
					System.out.println("Enter the old title: ");
					String oldTitle = input.nextLine();

					if (library.toLowerCase().contains(oldTitle.toLowerCase())){
						System.out.println("Enter the new title: ");
						String newTitle = input.nextLine();

						BookSuggestion.updateBooks(library, oldTitle, newTitle);
						System.out.printf("Book updated successfully!");
					}
	
					else{
						System.out.printf("%s is not in the library%n", oldTitle);}

				}
					break;
				case 5:{
					System.out.println("All Books");
					System.out.printf("%s ", BookSuggestion.outputBooksInShelve(library));
					break;
				}
				default:
					forward = false;
			}

		}
	}

}