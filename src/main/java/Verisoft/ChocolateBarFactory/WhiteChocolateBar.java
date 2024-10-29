package Verisoft.ChocolateBarFactory;
/**
 * Class representing a white chocolate bar.
 */
public class WhiteChocolateBar extends ChocolateBar {
    @Override
    public void produce() {
        System.out.println("Producing white chocolate bar");
    }

    @Override
    public void packageBar() {
        System.out.println("Packaging white chocolate bar");
    }
}
