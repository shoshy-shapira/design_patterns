package Verisoft.ChocolateBarFactory.factory;

import Verisoft.ChocolateBarFactory.ChocolateBar;
import Verisoft.ChocolateBarFactory.MilkChocolateBar;
/**
 * Factory class for creating MilkChocolateBar instances.
 */
public class MilkChocolateBarFactory extends ChocolateBarFactory{
    @Override
    public ChocolateBar createChocolateBar() {
        return new MilkChocolateBar();
    }
}
