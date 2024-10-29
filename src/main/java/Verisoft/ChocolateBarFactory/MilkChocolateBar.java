package Verisoft.ChocolateBarFactory;
/**
 * Class representing a milk chocolate bar.
 */
public class MilkChocolateBar extends ChocolateBar{
    @Override
    public void produce() {
        System.out.println("Producing milk chocolate bar");
    }

    @Override
    public void packageBar() {
        System.out.println("Packaging milk chocolate bar");
    }
}
