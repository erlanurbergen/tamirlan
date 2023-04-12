package tamirlan.shapes;

public class Eclipse extends Shape{
    private int firstNumber;
    private int secondNumber;

    public Eclipse(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }

    @Override
    void changeData(int... numbers) {
        this.firstNumber = numbers[0];
        this.secondNumber = numbers[1];
    }

    @Override
    public String toString() {
        return "Eclipse{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                '}';
    }
}
