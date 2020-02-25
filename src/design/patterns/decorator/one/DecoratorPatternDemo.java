package design.patterns.decorator.one;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape rectangle = new Rectangle();

        Shape redCircle = new RedShapeDecorator(circle);
        Shape redRectagle = new RedShapeDecorator(rectangle);
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("Circle red border");
        redCircle.draw();

        System.out.println("Rectangle with red border");
        redRectagle.draw();
    }
}
