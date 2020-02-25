package design.patterns.abstract_factory.one;

public class AbstractFactoryPatternDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);
        AbstractFactory roundedFactory = FactoryProducer.getFactory(true);

        shapeFactory.getShape("rectangle").draw();
        roundedFactory.getShape("rectangle").draw();
        shapeFactory.getShape("square").draw();
        roundedFactory.getShape("rectangle").draw();
    }
}
