package Verisoft.RemoteControlCars;

public class CarImpl implements Car {
    private String color;
    private int speed;
    private String model;

    /**
     * Constructs a specific car model with specified speed and color.
     *
     * @param model the model name of the car.
     * @param speed the speed of the car.
     * @param color the color of the car.
     */
    public CarImpl(String model, int speed, String color) {
        this.model = model;
        this.speed = speed;
        this.color = color;
    }

    @Override
    public void driveForward() {
        System.out.println(model + " is driving forward at speed " + speed + ".");

    }

    @Override
    public void driveBackward() {
        System.out.println(model + " is driving backward at speed " + speed + ".");

    }

    @Override
    public void turnLeft() {
        System.out.println(model + " is turning left.");

    }

    @Override
    public void turnRight() {
        System.out.println(model + " is turning right.");
    }
}
