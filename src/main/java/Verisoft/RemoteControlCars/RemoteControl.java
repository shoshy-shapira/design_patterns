package Verisoft.RemoteControlCars;

public interface RemoteControl {
    /**
     * Moves the car forward.
     */
    void moveForward();

    /**
     * Moves the car backward.
     */
    void moveBackward();

    /**
     * Turns the car to the left.
     */
    void turnLeft();

    /**
     * Turns the car to the right.
     */
    void turnRight();
}
