
import java.util.*;

abstract class Shape {
    int a;
    int b;

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        a = length;
        b = breadth;
    }

    void printArea() {
        int area = a * b;
        System.out.println("Area of Rectangle = " + area);
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        a = base;
        b = height;
    }

    void printArea() {
        double area = 0.5 * a * b;
        System.out.println("Area of Triangle = " + area);
    }
}

class Circle extends Shape {

    Circle(int radius) {
        a = radius;
    }

    void printArea() {
        double area = (22.0 / 7) * a * a;
        System.out.println("Area of Circle = " + area);
    }
}

public class ShapeArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Shape s;

        System.out.println("Enter length of Rectangle:");
        int length = sc.nextInt();

        System.out.println("Enter breadth of Rectangle:");
        int breadth = sc.nextInt();

        s = new Rectangle(length, breadth);
        s.printArea();

        System.out.println("\nEnter base of Triangle:");
        int base = sc.nextInt();

        System.out.println("Enter height of Triangle:");
        int height = sc.nextInt();

        s = new Triangle(base, height);
        s.printArea();

        System.out.println("\nEnter radius of Circle:");
        int radius = sc.nextInt();

        s = new Circle(radius);
        s.printArea();

        sc.close();
    }
}