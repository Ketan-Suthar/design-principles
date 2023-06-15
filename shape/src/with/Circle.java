package with;

public class Circle implements IShape{
    private Double radius;

    public Double getRadius() {
        return radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    public Double area() {
        return (22/7) * this.radius * this.radius;
    }
}
