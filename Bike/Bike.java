package bike;

public class Bike {

    private boolean statusOfBike;
    private int speed;
    private int gearLevel;

    private void setGear(){
        if (speed <= 20) gearLevel = 1;
        else if (speed <= 30) gearLevel = 2;
        else if (speed <= 40) gearLevel = 3;
        else gearLevel = 4;
    }

    public boolean bikeStatus() {
        return statusOfBike;
    }

    public void turnBikeOn() {
        statusOfBike = true;
    }

    public void turnBikeOff() {
        statusOfBike = false;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate() {
        if (statusOfBike){
            setGear();
            speed += gearLevel;
        }
    }

    public void decelerate() {
        if (statusOfBike){
            setGear();
            speed -= gearLevel;
        }
    }
}
