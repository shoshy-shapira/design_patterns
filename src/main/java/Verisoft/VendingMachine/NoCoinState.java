package Verisoft.VendingMachine;

/**
 * The NoCoinState class represents the state when no coin has been inserted into the vending machine.
 */
public class NoCoinState implements State {
    private final VendingMachine vendingMachine;

    /**
     * Constructor for NoCoinState.
     *
     * @param vendingMachine The vending machine context.
     */
    public NoCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted.");
        vendingMachine.setState(vendingMachine.getHasCoinState());
    }

    @Override
    public void selectProduct() {
        System.out.println("Insert a coin first.");
    }

    @Override
    public void dispense() {
        System.out.println("Insert a coin and select a product.");
    }
}