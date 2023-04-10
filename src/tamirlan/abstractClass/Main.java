package tamirlan.abstractClass;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Circle circle = new Circle("circle", 10); // circle
//        Shape shape = new Square("square", 15); // shape
//        printShape(circle);
//        printShape(shape);
//
//        // upcasting downcasting polymorphism
//
//        List<String> n = new ArrayList<>();

        Human h = new Human();
        Student s = new Student();

        // downcast
        Human h1 = new Student();

        // upcast
        Student h2 = (Student) new Human();
        System.out.println(h2);
    }

    private static void printShape(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}

abstract class Shape {
    private String name;

    public Shape(String name) {
        this.name = name;
    }

    abstract double getArea(); // draw not call not realize
    abstract double getPerimeter();

    public void printArea() {
        System.out.println("Area: " + getArea());
    }

    public void printPerimeter() {
        System.out.println("Perimeter: " + getPerimeter());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    double getPerimeter() {
        return radius * 2 * 3.14;
    }
}

class Square extends Shape {
    private double width;

    public Square(String name, double width) {
        super(name);
        this.width = width;
    }

    @Override
    double getArea() {
        return width * width;
    }

    @Override
    double getPerimeter() {
        return 4 * width;
    }

    void squareMethod() {
        System.out.println("square");
    }
}

class Human {

}

class Student extends Human {

}
