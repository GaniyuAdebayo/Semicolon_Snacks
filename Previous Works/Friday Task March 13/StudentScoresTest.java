import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;



public class StudentScoresTest{

	@Test
	public void testNumberOfVowelsAndConsonantsAreCorrect(){

		String word = "balenciaga";
		int [] expected = StudentScores.vowelConsonantCount(word);
		int [] actual = {5, 5};

		assertArrayEquals(expected, actual);

	}

	@Test
	public void testStringAtEvenPositions(){

		String word = "Beijing Chicago";
		String expected = StudentScores.lettersAtEvenPositions(word);
		String actual = "ejnhcg";
		assertEquals(expected, actual);
	}

	@Test
	public void testCombinationOfNumbersAreEqual(){
		int expected = StudentScores.numberCombination(7, 2);
		int actual = 21;
		assertEquals(expected, actual);	
	}

	@Test
	public void testItThrowsExceptionWhenFirstNumberIsLessThanSecondNumber(){
		assertThrows(IllegalArgumentException.class, () -> StudentScores.numberCombination(3, 7));
	}

	@Test
	public void testItThrowsExceptionWhenFirstNumberIsGreaterThan9(){
		assertThrows(IllegalArgumentException.class, () -> StudentScores.numberCombination(12, 7));
	}

	@Test
	public void testItThrowsExceptionWhenArgumentIsNegative(){
		assertThrows(IllegalArgumentException.class, () -> StudentScores.numberCombination(-3, -7));

	}




}