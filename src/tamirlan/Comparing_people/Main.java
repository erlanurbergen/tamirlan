package tamirlan.Comparing_people;

public class Main {
    public static void main(String[] args) {
        // Interfaces
        Bird bird = new Bird();
        showSomething(bird);
    }

    private static void showSomething(Fly fly) {
        System.out.println(fly);
    }
}

interface Fly {
    void fly();
}

interface Swim {
    void swim();
}

class Bird implements Fly, Swim {
    private String type;

    @Override
    public void fly() {
        System.out.println("bird is flying");
    }

    @Override
    public void swim() {
        System.out.println("bird is swimming");
    }
}
