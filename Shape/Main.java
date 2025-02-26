package Shape;
public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.CIRCLE);
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.RECTANGLE);
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.SQUARE);
        Shape shape4 = ShapeFactory.getShape(ShapeFactory.CIRCLE);
        Shape shape5 = ShapeFactory.getShape(ShapeFactory.RECTANGLE);
        Shape shape6 = ShapeFactory.getShape(ShapeFactory.SQUARE);
        shape1.draw();
        shape2.draw();
        shape3.draw();
        shape4.draw();
        shape5.draw();
        shape6.draw();
    }
}
