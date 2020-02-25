package design.patterns.abstract_factory.one;

public class RoundedRectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Inside rounded rectangle");
    }
}
