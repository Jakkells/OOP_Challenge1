public class Main {
    public static void main(String[] args) {

        Colour blue = new Colour(0, 0, 255);
        Colour red = new Colour(255, 0, 0);

        Shapes [] shapes = new Shapes[3];

        shapes [0] = new Circle(blue, 10);
        shapes [1] = new Rectangle(red, 10, 15);
        shapes [2] = new Triangle(blue, 10, 20);


        for (Shapes shape : shapes) {
            shape.draw();
        }



    }
}