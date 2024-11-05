package Verisoft.VendingMachine;

/**
 * The HasCoinState class represents the state when a coin has been inserted into the vending machine.
 */
public class HasCoinState implements State {
    private final VendingMachine vendingMachine;

    /**
     * Constructor for HasCoinState.
     *
     * @param vendingMachine The vending machine context.
     */
    public HasCoinState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product selected.");
        vendingMachine.setState(vendingMachine.getSoldState());
    }

    @Override
    public void dispense() {
        System.out.println("Select a product first.");
    }
}