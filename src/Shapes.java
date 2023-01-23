public class Shapes {
     private Colour colour;

    public Shapes(Colour colour) {
        this.colour = colour;
    }

    public Colour getColour() {
        return colour;
    }

    public void setColour(Colour colour) {
        this.colour = colour;
    }

    public void draw (){
        System.out.println("Drawing shape with " + colour);
    }
}

class Circle extends Shapes {
    int radius;

    public Circle(Colour colour, int radius) {
        super(colour);
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a circle with radius " + radius + " of the colour " + getColour());
    }
}

class Rectangle extends Shapes{
    int width;
    int length;

    public Rectangle(Colour colour, int width, int length) {
        super(colour);
        this.width = width;
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle with the width " + width + " and length " + length + " with rbg colour " + getColour());
    }
}

class Triangle extends Shapes {
    int base;
    int height;

    public Triangle(Colour colour, int base, int height) {
        super(colour);
        this.base = base;
        this.height = height;
    }

    public int getBase() {
        return base;
    }

    public int getHeight() {
        return height;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public void draw() {
        System.out.println("Drawing Triangle of height " + height + " and base " + base + " and of colour " +getColour());
    }
}

class Colour {
    int r,g,b;

    public Colour(int r, int g, int b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Colour{" +
                "r=" + r +
                ", g=" + g +
                ", b=" + b +
                '}';
    }
}

