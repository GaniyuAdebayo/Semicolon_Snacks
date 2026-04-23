import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;


public class AirConditionersTest{

	public static AirConditioners ac  = null;

	@BeforeEach
	public void beforeEach(){
	 	ac = new AirConditioners();
	}

	@Test
	public void testACIsOff(){
		assertFalse(ac.status());
	}

	@Test
	public void testACIsOnWhenTurnedOn(){
		ac.turnOn();
		assertTrue(ac.status());
	}

	@Test
	public void testACIsOffWhenITurnOffFromOn(){
		ac.turnOn();
		ac.turnOff();
		assertFalse(ac.status());
	}

	@Test
	public void testACTemperatureIs17WhenIncreasedOnce(){
		ac.turnOn();
		ac.increaseTemperature();
		int expectedTemperature = ac.checkTemperature();
		int actual = 17;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureIs18WhenIncreased5TimesAndReducedThrice(){
		ac.turnOn();
		for (int increment = 1; increment <= 5; increment++){
			ac.increaseTemperature();
		}
		for (int decrement = 1; decrement <= 3; decrement++){
			ac.decreaseTemperature();
		}
		int expectedTemperature = ac.checkTemperature();
		int actual = 18;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureIs30WhenTurnedOnAndIncreased17Times(){
		ac.turnOn();
		
		for (int increment = 1; increment <= 17; increment++){
			ac.increaseTemperature();
		}
		int expectedTemperature = ac.checkTemperature();
		int actual = 30;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureIs16WhenDecreased5Times(){
		ac.turnOn();
		for (int decrement = 1; decrement <= 5; decrement++){
			ac.decreaseTemperature();
		}
		int expectedTemperature = ac.checkTemperature();
		int actual = 16;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureDoesntIncreaseWhenOff(){
		for (int increment = 1; increment <= 10; increment++){
			ac.increaseTemperature();
		}
		int expectedTemperature = ac.checkTemperature();
		int actual = 0;
		assertEquals(expectedTemperature, actual);

	}

	

}