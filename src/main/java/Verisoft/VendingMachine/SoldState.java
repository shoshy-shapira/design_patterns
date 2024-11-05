package Verisoft.VendingMachine;

/**
 * The SoldState class represents the state when a product is dispensed from the vending machine.
 */
public class SoldState implements State {
    private final VendingMachine vendingMachine;

    /**
     * Constructor for SoldState.
     *
     * @param vendingMachine The vending machine context.
     */
    public SoldState(VendingMachine vendingMachine) {
        this.vendingMachine = vendingMachine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait for current product to be dispensed.");
    }

    @Override
    public void selectProduct() {
        System.out.println("Product already selected. Dispensing...");
    }

    @Override
    public void dispense() {
        System.out.println("Dispensing product.");
        vendingMachine.setState(vendingMachine.getNoCoinState());
    }
}