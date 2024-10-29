package Verisoft.ParkDesign;

import java.util.ArrayList;
import java.util.List;

/**
 * Concrete class representing a FlowerBed in the park.
 * Can contain child elements like individual flowers.
 */
public class FlowerBed implements ParkElement, ParkElements{
    private String name;
    private List<ParkElement> flowers = new ArrayList<>();

    public FlowerBed(String name) {
        this.name = name;
    }

   @Override
    public void add(ParkElement element) {
        flowers.add(element);
    }

   @Override
    public void remove(ParkElement element) {
        flowers.remove(element);
    }

    @Override
    public void display() {
        System.out.println("FlowerBed: " + name);
        for(ParkElement flower: flowers){
            flower.display();
        }
    }
}
