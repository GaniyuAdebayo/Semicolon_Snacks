package test;

import bike.Bike;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class BikeTest {

    @Test
    public void initialStateOfBike_bikeIsOff(){
        Bike bike = new Bike();
        assertFalse(bike.bikeStatus());
    }

    @Test
    public void bikeTurnedOn_bikeIsOn(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        assertTrue(bike.bikeStatus());
    }

    @Test
    public void bikeIsTurnedOnThenOff_bikeIsOff(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        bike.turnBikeOff();
        assertFalse(bike.bikeStatus());
    }

    @Test
    public void bikeIsTurnedOn_speedIs0(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        assertEquals(bike.getSpeed(), 0);
    }

    @Test
    public void bikeIsTurnedOn_acceleratedOnce_speedIs1(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        bike.accelerate();
        assertEquals(bike.getSpeed(), 1);
    }
    @Test
    public void bikeIsTurnedOn_accelerated5times_speedIs5(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 5; count++){
            bike.accelerate();
        }
        assertEquals(bike.getSpeed(), 5);
    }

    @Test
    public void bikeIsTurnedOn_accelerated22times_speedIs23(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 22; count++){
            bike.accelerate();
        }
        assertEquals(bike.getSpeed(), 23);
    }

    @Test
    public void bikeIsTurnedOn_accelerated27times_speedIs34(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 27; count++){
            bike.accelerate();
        }
        assertEquals(bike.getSpeed(), 34);
    }

    @Test
    public void bikeIsTurnedOn_accelerated31times_speedIs47(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 31; count++){
            bike.accelerate();
        }
        assertEquals(bike.getSpeed(), 47);
    }

    @Test
    public void bikeIsAccelerated32Times_decelerated2Times_speedIs43(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 32; count++){
            bike.accelerate();
        }
        bike.decelerate();
        bike.decelerate();
        assertEquals(bike.getSpeed(), 43);
    }

    @Test
    public void bikeIsAccelerated32Times_decelerated4Times_speedIs36(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 32; count++){
            bike.accelerate();
        }
        for (int count = 1; count <= 4; count++){
            bike.decelerate();
        }
        assertEquals(bike.getSpeed(), 36);
    }

    @Test
    public void bikeIsAccelerated32Times_decelerated7Times_speedIs28(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 32; count++){
            bike.accelerate();
        }
        for (int count = 1; count <= 7; count++){
            bike.decelerate();
        }
        assertEquals(bike.getSpeed(), 28);
    }

    @Test
    public void bikeIsAccelerated32Times_decelerated13Times_speedIs18(){
        Bike bike = new Bike();
        bike.turnBikeOn();
        for (int count = 1; count <= 32; count++){
            bike.accelerate();
        }
        for (int count = 1; count <= 13; count++){
            bike.decelerate();
        }
        assertEquals(bike.getSpeed(), 18);
    }

    @Test
    public void bikeIsOff_accelerated1Time_speedIs0(){
        Bike bike = new Bike();
        bike.accelerate();
        assertEquals(bike.getSpeed(), 0);

    }

}
