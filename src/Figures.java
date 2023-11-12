abstract class Figure {
    public abstract double calculateArea();
    public abstract double calculatePerimeter();
}

class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return "Rectangle: Length = " + length + ", Width = " + width;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj instanceof Rectangle) {
            Rectangle other = (Rectangle) obj;
            if (this.length == other.length &&
                this.width == other.width) {
                b = true;
            }
        }
        return b;
    }
}

class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "Circle: Radius = " + radius;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj instanceof Circle) {
            Circle other = (Circle) obj;
            if (this.radius == other.radius) {
                b = true;
            }
        }
        return b;
    }
}

class Trapezium extends Figure {
    private double base1;
    private double base2;
    private double height;

    public Trapezium(double base1, double base2, double height) {
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (base1 + base2) * height;
    }

    @Override
    public double calculatePerimeter() {
        return base1 + base2 + 2 * Math.sqrt(Math.pow((base1 - base2) / 2, 2) + height * height);
    }

    @Override
    public String toString() {
        return "Trapezium: Base1 = " + base1 + ", Base2 = " + base2 + ", Height = " + height;
    }

    @Override
    public boolean equals(Object obj) {
        boolean b = false;
        if (obj instanceof Trapezium) {
            Trapezium other = (Trapezium) obj;
            if (this.base1 == other.base1 &&
                this.base2 == other.base2 &&
                this.height == other.height) {
                b = true;
            }
        }
        return b;
    }
}

public class Figures {
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];

        figures[0] = new Rectangle(5, 10);
        figures[1] = new Circle(7);
        figures[2] = new Trapezium(8, 6, 4);

        for (Figure figure : figures) {
            System.out.println(figure);
            System.out.println("Area: " + figure.calculateArea());
            System.out.println("Perimeter: " + figure.calculatePerimeter());
            System.out.println();
        }
    }
}
