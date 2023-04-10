package tamirlan.inheritance;

public class Laptop extends Device{

    private String processor;
    private boolean keyboard;

    public Laptop() {
    }

    public Laptop(String processor, boolean keyboard) {
        this.processor = processor;
        this.keyboard = keyboard;
    }

    public Laptop(String name, double price, String processor, boolean keyboard) {
        super(name, price);
        this.processor = processor;
        this.keyboard = keyboard;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public boolean isKeyboard() {
        return keyboard;
    }

    public void setKeyboard(boolean keyboard) {
        this.keyboard = keyboard;
    }

    @Override
    double getTotal(int count) {
        if (keyboard)
            return super.getTotal(count);
        return 0;
    }

    @Override
    void sale(int percent) {
        if (keyboard)
            super.sale(percent);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "processor='" + processor + '\'' +
                ", keyboard=" + keyboard +
                '}';
    }
}
