package Retangle;

public class Retangle {
    private double length;
    private double width;

    public Retangle() {
        length = 1.0;
        width = 1.0;
    }

    public Retangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Retangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return 2*(length+width);
    }
}
