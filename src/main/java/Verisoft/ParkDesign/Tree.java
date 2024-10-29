package Verisoft.ParkDesign;

import java.util.ArrayList;
import java.util.List;
/**
 * Concrete class representing a Tree in the park.
 * Can contain child elements like other trees or flower beds.
 */
public class Tree implements ParkElement, ParkElements {
    private String name;
    private List<ParkElement> children = new ArrayList<>();

    public Tree(String name) {
        this.name = name;
    }

   @Override
    public void add(ParkElement element) {
        children.add(element);

    }

   @Override
    public void remove(ParkElement element) {
        children.remove(element);
    }

    @Override
    public void display() {
        System.out.println("tree:" + name);
        for (ParkElement child : children)
            child.display();
    }
}
