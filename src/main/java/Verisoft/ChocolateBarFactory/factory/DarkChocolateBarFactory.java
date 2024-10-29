package Verisoft.ChocolateBarFactory.factory;

import Verisoft.ChocolateBarFactory.ChocolateBar;
import Verisoft.ChocolateBarFactory.DarkChocolateBar;

/**
 * Factory class for creating DarkChocolateBar instances.
 */
public class DarkChocolateBarFactory extends ChocolateBarFactory {

    @Override
    public ChocolateBar createChocolateBar() {
       return new DarkChocolateBar() ;

    }
}
