package day36_polimorphism;

public class Circle {

    private double radius;

    public final static double PI=3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double area(){
        return radius*radius*PI;
    }

    public double perimeter(){
        return radius*2*PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle)){
            System.err.println("Invalid object");
            System.exit(1);
        }
        if(radius==((Circle) obj).radius){
            return true;
        }
        return false;
    }
}
