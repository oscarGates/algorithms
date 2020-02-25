package design.patterns.facade.one;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing from an square");
    }
}
