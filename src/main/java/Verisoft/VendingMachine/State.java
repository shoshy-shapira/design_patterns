package Verisoft.VendingMachine;

/**
 * The State interface defines the actions that can be performed on the vending machine.
 */
public interface State {
    /**
     * Method to handle the action when a coin is inserted.
     */
    void insertCoin();

    /**
     * Method to handle the action when a product is selected.
     */
    void selectProduct();

    /**
     * Method to handle the action when an item is dispensed.
     */
    void dispense();
}