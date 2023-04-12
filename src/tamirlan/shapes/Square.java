package tamirlan.shapes;

public class Square extends Shape{
    private int radius;

    public Square(int radius) {
        this.radius = radius;
    }

    @Override
    void changeData(int... numbers) {
        this.radius = numbers[0];
    }

    @Override
    public String toString() {
        return "Square{" +
                "radius=" + radius +
                '}';
    }
}
