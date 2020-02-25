package design.patterns.facade.one;

public class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Drawing from a rectangle");
    }
}
