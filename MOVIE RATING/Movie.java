import java.time.LocalDateTime;
public class Movie {
    private String movie;
    private int rating;
    private int numberOfRatings = 0;
    private int [] ratings = new int [10];
    private final LocalDateTime time = LocalDateTime.now();

    public String getMovie() {
        return movie;
    }

    public void setMovie(String movie) {
        this.movie = movie;
    }

    public void setRating(int rating) {
        if (rating < 1 || rating > 5) throw new IllegalArgumentException();
        this.rating = rating;
        ratings[numberOfRatings] = rating;
        numberOfRatings++;
    }
    public double getAverageRating(){
        if (numberOfRatings == 0) return 0;
        int sum = 0;
        for(int index = 0; index < numberOfRatings; index++){
            sum += ratings[index];
        }
        return (sum * 1.0)/numberOfRatings;
    }
    @Override
    public String toString(){
        return String.format("%nMovie Name: %s%nAverage Rating: %.1f%nDate Added: %tF%nTime Added: %tT%n",
                getMovie(), getAverageRating(), time.toLocalDate(), time.toLocalTime());
    }
}