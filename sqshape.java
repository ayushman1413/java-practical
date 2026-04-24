abstract class Shape {
    abstract void draw();
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Square");
    }
}

public class sqshape {
    public static void main(String[] args) {
        Shape myCircle = new Circle();
        Shape mySquare = new Square();

        myCircle.draw();
        mySquare.draw();
    }
}
