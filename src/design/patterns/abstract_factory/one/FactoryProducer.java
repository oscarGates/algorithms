package design.patterns.abstract_factory.one;

public class FactoryProducer {
    public static AbstractFactory getFactory(boolean rounded){
        if(rounded)
            return new RoundedShapeFactory();
        else
            return new ShapeFactory();
    }
}
