import org.junit.jupiter.api.Test;

public class MovieRatingSystem {
    Movie [] movies = new Movie[10];
    private int getNoOfMovies = 0;

    public Movie addMovie(String movieTitle){
        Movie movie = new Movie();
        movie.setMovie(movieTitle);
        movies[getNoOfMovies++] = movie;
        return movie;
    }
    public void addRating(String movieTitle, int rating){
        for(int index = 0; index < getNoOfMovies; index++){
            if(movies[index].getMovie().equalsIgnoreCase(movieTitle.trim())) movies[index].setRating(rating);
        }
    }
    public boolean validateMovieTitle(String movieTitle){
        for(int index = 0; index < getNoOfMovies; index++){
            if(movies[index].getMovie().equalsIgnoreCase(movieTitle.trim())) return true;
        }
        return false;
    }

    public Movie getMovieTitle(String movieTitle){
        for(int index = 0; index < getNoOfMovies; index++){
            if(movies[index].getMovie().equalsIgnoreCase(movieTitle.trim())) return movies[index];
        }
        return null;
    }

    public boolean isEmpty() {
        return getNoOfMovies == 0;
    }
    public String getAverageRatings(){
        if (isEmpty()) return null;
        StringBuilder output = new StringBuilder();
        for (int index = 0; index < getNoOfMovies; index++){
            output.append(movies[index]);
        }
        return output.toString();
    }
}
