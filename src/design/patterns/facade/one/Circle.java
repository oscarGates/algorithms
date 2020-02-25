package design.patterns.facade.one;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing from a circle");
    }
}
