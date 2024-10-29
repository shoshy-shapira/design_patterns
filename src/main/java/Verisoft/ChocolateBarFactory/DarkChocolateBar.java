package Verisoft.ChocolateBarFactory;

public class DarkChocolateBar extends ChocolateBar {

    @Override
    public void produce() {
        System.out.println("Producing dark chocolate bar");
    }

    @Override
    public void packageBar() {
        System.out.println("Packaging dark chocolate bar");
    }
}
