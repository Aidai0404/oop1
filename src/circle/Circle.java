package circle;

public class Circle {
   private static final double PI = 3.14;
    int radius;


    public Circle(int radius, int radius2) {

        this.radius = radius;


    }

    static double area(double radius) {
        return PI*radius * radius;
    }

    static double circumference2(double radius) {

        return PI *2 * radius;

    }

}