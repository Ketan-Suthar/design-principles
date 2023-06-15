package with;

public class Rectangle implements IShape{
    private Double length;
    private Double width;

    @Override
    public Double area() {
        return this.length * this.width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }
}
