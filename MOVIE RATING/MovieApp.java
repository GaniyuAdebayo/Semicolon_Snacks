import java.util.Scanner;
public class MovieApp{
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        MovieRatingSystem movieRatingSystem = new MovieRatingSystem();

        String mainMenu = """
                1. Add Movie
                2. Rate A Movie
                3. View Average Ratings
                4. Exit
                """;
        String option;
        do{
            System.out.println(mainMenu);
            System.out.print("Enter Option: ");
            option = input.nextLine();
            switch (option){
                case "1":
                    System.out.println("Enter movie name: ");
                    String movieName = input.nextLine();
                    movieRatingSystem.addMovie(movieName);
                    System.out.printf("Movie \"%s\" added!%n", movieName);
                    break;
                case "2":
                    if (movieRatingSystem.isEmpty()) System.out.println("No movie added yet");
                    else{
                        System.out.println("Enter movie name: ");
                        movieName = input.nextLine();
                        if(movieRatingSystem.validateMovieTitle(movieName)){
                            System.out.print("Enter your rating(1-5): ");
                            int rating = input.nextInt();
                            input.nextLine();
                            movieRatingSystem.addRating(movieName, rating);
                            System.out.printf("Rating added for '%s' %d%n", movieName, rating);
                        }
                        else
                            System.out.println("Movie title not present!");
                    }
                    break;

                case "3":
                    if (movieRatingSystem.isEmpty()) System.out.println("No movie added yet");
                    else System.out.println(movieRatingSystem.getAverageRatings());
                    break;
                case "4":
                    option = "4";
                    break;

                default:
                    System.out.println("Invalid Input!");
            }
        }
        while(!option.equals("4"));
    }

}