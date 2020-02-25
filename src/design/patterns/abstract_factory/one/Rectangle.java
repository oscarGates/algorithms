package design.patterns.abstract_factory.one;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside rectangle");
    }
}
