package design.patterns.abstract_factory.one;

public class RoundedShapeFactory extends AbstractFactory {
    @Override
    Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("rectangle"))
            return new RoundedRectangle();
        if(shapeType.equalsIgnoreCase("square"))
            return new RoundedSquare();
        return null;
    }
}
