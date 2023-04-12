package tamirlan.Coloured_points;

public class ColoredPoints extends Points{
    private Color colorPoint;

    public ColoredPoints(double x, double y, double z) {
        super(x, y, z);
    }

    public ColoredPoints(double x, double y, double z, Color colorPoint) {
        super(x, y, z);
        this.colorPoint = colorPoint;
    }

    @Override
    public String toString() {
        return super.toString() + " " + colorPoint  ;
    }

    //    @Override
//    public String toString() {
//        return "color: " + colorPoint +
//                "position: " + getX() + " " + getY() + " " + getZ();
//    }
}
