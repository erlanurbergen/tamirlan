package tamirlan.Flawed_rectangle;

public class ChangeRectangle {

    private int width;
    private int height;

    public ChangeRectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public ChangeRectangle() {
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getArea() {
        if (width <= 0 || height <= 0) {
            try {
                throw new Exception("Значения не корректны");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return width * height;
    }

    @Override
    public String toString() {
        return "ChangeRectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
