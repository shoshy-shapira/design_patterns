package Verisoft.ChocolateBarFactory.factory;

import Verisoft.ChocolateBarFactory.ChocolateBar;

/**
 * Abstract factory class for creating chocolate bars.
 * Defines the factory method for creating a chocolate bar.
 */
public abstract class ChocolateBarFactory {
    /**
     * Factory method to create a specific type of chocolate bar.
     * @return a new instance of ChocolateBar.
     */
    public abstract ChocolateBar createChocolateBar();
}
