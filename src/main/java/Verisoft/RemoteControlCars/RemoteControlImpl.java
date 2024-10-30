package Verisoft.RemoteControlCars;

public class RemoteControlImpl implements RemoteControl {
    private final Car car;

    /**
     * Constructs a remote control for a specific car.
     *
     * @param car the car to control with this remote.
     */
    public RemoteControlImpl(Car car) {
        this.car = car;
    }

    @Override
    public void moveForward() {
        car.driveForward();
    }

    @Override
    public void moveBackward() {
        car.driveBackward();
    }

    @Override
    public void turnLeft() {
        car.turnLeft();
    }

    @Override
    public void turnRight() {
        car.turnRight();
    }
}
