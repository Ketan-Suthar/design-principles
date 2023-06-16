package without;

public class AreaCalculator {
    public Double areaRectangle(final Rectangle rectangle){
        return rectangle.getLength() * rectangle.getWidth();
    }

    public Double areaCircle(final Circle circle){
        return (22/7) * circle.getRadius() * circle.getRadius();
    }
}
