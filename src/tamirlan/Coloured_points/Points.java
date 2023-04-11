package tamirlan.Coloured_points;

public class Points {
    private final double x;
    private final double y;
    private final double z;

    public Points(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public Points beginPoints() {
        // 0 0 0
        return new Points(0, 0, 0);
    }

//    public double betweenDistance() {
//    }

    public double getDistance(Points p) {
        return Math.sqrt(Math.pow((getX() - 0), 2) + Math.pow((getY() - 0), 2));

    }

    @Override
    public String toString() {
        return "Points{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
