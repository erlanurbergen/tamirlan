package tamirlan.inheritance;

// parent class
public class Device {

    // attributes
    private String name;
    private double price;

    public Device() {
    }

    public Device(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // methods
    double getTotal(int count) {
        return price * count;
    }

    void sale(int percent){
        // 20% = (100 000 * 20) / 100
        this.price = price - (price * percent) / 100;
    }

    @Override
    public String toString() {
        return "Device{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
