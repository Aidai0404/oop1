package circle;

public class Circle {
    int PI;
    int radius;
    int radius2;


    public Circle(int PI,int radius,int radius2) {
        this.PI = PI;
        this.radius=radius;
        this.radius2=radius2;



    }
    static void area(int PI,int radius,int radius2){
       PI=radius*radius2;
        System.out.println(PI);
    }
    static void circumference2(int PI,int radius){
        PI *= 2 * radius;
        System.out.println(PI);

    }

    public int getPI() {
        return PI;
    }

    public void setPI(int PI) {
        this.PI = PI;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius2() {
        return radius2;
    }

    public void setRadius2(int radius2) {
        this.radius2 = radius2;
    }

}
