package Verisoft.ChocolateBarFactory.factory;

import Verisoft.ChocolateBarFactory.ChocolateBar;
import Verisoft.ChocolateBarFactory.WhiteChocolateBar;
/**
 * Factory class for creating WhiteChocolateBar instances.
 */
public class WhiteChocolateBarFactory extends ChocolateBarFactory{
    @Override
    public ChocolateBar createChocolateBar() {
        return new WhiteChocolateBar();
    }
}
