package OCP_Task;

interface Shape {
    double calculateArea();
}

class Rectangle implements Shape {
    public double length;
    public double width;

    @Override
    public double calculateArea() {
        return length * width;

    
    }


}

class Circle implements Shape {
    public double radius;

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class AreaCalculator {
    public double calculateTotalArea(Shape[] shapes) {
        double area = 0;
        for (Shape shape : shapes) {
            area += shape.calculateArea();
        }
        return area;
    }
}


public class Main {
    public static void main(String[] args) {

        Rectangle r = new Rectangle();
        r.length = 10;
        r.width = 5;

        Circle c = new Circle();
        c.radius = 7;

        Shape[] shapes = {r, c};

        AreaCalculator calculator = new AreaCalculator();

        System.out.println(
            "Total Area = " +
            calculator.calculateTotalArea(shapes)
        );
    }
