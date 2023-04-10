package tamirlan.inheritance;

public class Mobile extends Device{

    private boolean smartphone;

    public Mobile(boolean smartphone) {
        this.smartphone = smartphone;
    }

    public Mobile(String name, double price, boolean smartphone) {
        super(name, price);
        this.smartphone = smartphone;
    }

    public boolean isSmartphone() {
        return smartphone;
    }

    public void setSmartphone(boolean smartphone) {
        this.smartphone = smartphone;
    }

    @Override
    double getTotal(int count) {
        return super.getTotal(count);
    }

    @Override
    void sale(int percent) {
        super.sale(percent);
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "smartphone=" + smartphone +
                '}';
    }
}
