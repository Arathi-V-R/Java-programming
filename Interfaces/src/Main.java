public class Main {

    public static void main(String[] args) {
        displayShape(new Square());
        displayShape(new Triangle());
        displayShape(new Circle());
    }

    static void displayShape(Shape shape){
        System.out.println(shape.getName());
        shape.draw();
        System.out.println(shape.getSideCount());
    }
}
