import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MovieRatingSystemTest {

    MovieRatingSystem movieRatingSystem;
    @BeforeEach
    public void setUp(){
        movieRatingSystem = new MovieRatingSystem();
    }

    @Test
    public void testMovieArchiveIsEmpty(){
        assertTrue(movieRatingSystem.isEmpty());
    }

    @Test
    public void testAddMovie(){
        movieRatingSystem.addMovie("Koto Aye");
        movieRatingSystem.addMovie("Ipadabo Abija");
    }

    @Test
    public void testMovieIsPresent(){
        movieRatingSystem.addMovie("Koto Aye");
        movieRatingSystem.addMovie("Ipadabo Abija");
        assertTrue(movieRatingSystem.validateMovieTitle("ipadabo Abija"));
    }
    @Test
    public void testMovieIsNotPresent(){
        movieRatingSystem.addMovie("Koto Aye");
        movieRatingSystem.addMovie("Ipadabo Abija");
        assertFalse(movieRatingSystem.validateMovieTitle("dabo Abija"));
    }
    @Test
    public void testAddRating(){
        movieRatingSystem.addMovie("Koto Aye");
        movieRatingSystem.addRating("koto aye", 5);
    }
    @Test
    public void testAddRating_whenRatingIsAbove5(){
        movieRatingSystem.addMovie("Koto Aye");
        assertThrows(IllegalArgumentException.class, () -> movieRatingSystem.addRating("koto aye", 7));
    }
    @Test
    public void testAddRating_whenRatingIsBelow1(){
        movieRatingSystem.addMovie("Koto Aye");
        assertThrows(IllegalArgumentException.class, () -> movieRatingSystem.addRating("koto aye", -3));
    }
    @Test
    public void testAverageRating(){
        movieRatingSystem.addMovie("Koto Aye");
        movieRatingSystem.addRating("koto aye", 5);
        movieRatingSystem.addRating("koto aye", 4);
        movieRatingSystem.addRating("koto aye", 4);
        movieRatingSystem.addRating("koto aye", 3);
        movieRatingSystem.addRating("koto aye", 5);
        assertEquals(4.2, movieRatingSystem.getMovieTitle("Koto Aye").getAverageRating());

    }


}