import java.io.*;
public class TestSimpleCircle {
    public static void main(string[] args) {
        // buat circle dengan radius 1
        SimpleCircle circle1 = new SimpleCircle();
        System.out.println("area of the circle of radius " + circle1.radius + " is " + circle1.getArea());

        //buat circle dengan radius 25
        SimpleCircle circle2 = new SimpleCircle(25);
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());

        // buat circle dengan radius 125
        SimpleCircle circle3 = new SimpleCircle(125);
        System.out.println("The area of the circle of radius " + circle3.radius + " is " + circle3.getArea());

        //modify circle radius
        circle2.radius = 100; // or circle2.setRadius(100)
        System.out.println("The area of the circle of radius " + circle2.radius + " is " + circle2.getArea());


    }
}