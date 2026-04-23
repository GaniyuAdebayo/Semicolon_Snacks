import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import org.junit.jupiter.api.BeforeEach;


public class AirConditionerTest{

	@BeforeEach
	public void beforeEach(){
		AirConditioner.reset();
	}

	@Test
	public void testACIsOff(){
		assertFalse(AirConditioner.status());
	}

	@Test
	public void testACIsOnWhenTurnedOn(){
		AirConditioner.turnOn();
		assertTrue(AirConditioner.status());
	}

	@Test
	public void testACIsOffWhenITurnOffFromOn(){
		AirConditioner.turnOn();
		AirConditioner.turnOff();
		assertFalse(AirConditioner.status());
	}

	@Test
	public void testACTemperatureIs17WhenIncreasedOnce(){
		AirConditioner.turnOn();
		AirConditioner.increaseTemperature();
		int expectedTemperature = AirConditioner.checkTemperature();
		int actual = 17;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureIs18WhenIncreased5TimesAndReducedThrice(){
		AirConditioner.turnOn();
		for (int increment = 1; increment <= 5; increment++){
			AirConditioner.increaseTemperature();
		}
		for (int decrement = 1; decrement <= 3; decrement++){
			AirConditioner.decreaseTemperature();
		}
		int expectedTemperature = AirConditioner.checkTemperature();
		int actual = 18;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureIs30WhenTurnedOnAndIncreased17Times(){
		AirConditioner.turnOn();
		
		for (int increment = 1; increment <= 17; increment++){
			AirConditioner.increaseTemperature();
		}
		int expectedTemperature = AirConditioner.checkTemperature();
		int actual = 30;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureIs16WhenDecreased5Times(){
		AirConditioner.turnOn();
		for (int decrement = 1; decrement <= 5; decrement++){
			AirConditioner.decreaseTemperature();
		}
		int expectedTemperature = AirConditioner.checkTemperature();
		int actual = 16;
		assertEquals(expectedTemperature, actual);
	}

	@Test
	public void testACTemperatureDoesntIncreaseWhenOff(){
		for (int increment = 1; increment <= 10; increment++){
			AirConditioner.increaseTemperature();
		}
		int expectedTemperature = AirConditioner.checkTemperature();
		int actual = 0;
		assertEquals(expectedTemperature, actual);

	}

	

}