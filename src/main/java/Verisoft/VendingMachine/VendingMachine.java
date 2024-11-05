package Verisoft.VendingMachine;

/**
 * The VendingMachine class represents the context, maintaining the current state
 * and delegating requests to the current state.
 */
public class VendingMachine {
    private final State noCoinState;
    private final State hasCoinState;
    private final State soldState;
    private State currentState;

    /**
     * Constructor for VendingMachine, initializing all states and setting the default state.
     */
    public VendingMachine() {
        noCoinState = new NoCoinState(this);
        hasCoinState = new HasCoinState(this);
        soldState = new SoldState(this);
        currentState = noCoinState;
    }

    /**
     * Sets the current state of the vending machine.
     *
     * @param state The new state.
     */
    public void setState(State state) {
        currentState = state;
    }

    /**
     * Gets the noCoinState instance.
     *
     * @return The noCoinState.
     */
    public State getNoCoinState() {
        return noCoinState;
    }

    /**
     * Gets the hasCoinState instance.
     *
     * @return The hasCoinState.
     */
    public State getHasCoinState() {
        return hasCoinState;
    }

    /**
     * Gets the soldState instance.
     *
     * @return The soldState.
     */
    public State getSoldState() {
        return soldState;
    }

    // Delegated actions to the current state
    public void insertCoin() {
        currentState.insertCoin();
    }

    public void selectProduct() {
        currentState.selectProduct();
    }

    public void dispense() {
        currentState.dispense();
    }
}