package tamirlan.shapes;

public class Main {
    public static void main(String[] args) {
        Eclipse eclipse = new Eclipse(1, 2);
        Square s = new Square(10);
        System.out.println(eclipse);
        System.out.println(s);
        eclipse.changeData(22, 33);
        s.changeData(99);
        System.out.println(eclipse);
        System.out.println(s);
    }
}
