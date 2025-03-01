package Shape;

public class ShapeFactory {
    public static final int CIRCLE = 0;
    public static final int RECTANGLE = 1;
    public static final int SQUARE = 2;
    private static int countTotal = 0;
    private static int countCircle = 0;
    private static int countRectangle = 0;
    private static int countSquare = 0;
    private static final int countCirclelimit = 2;
    private static final int countRectanglelimit = 2;
    private static final int countSquarelimit = 2;
    private static final int countTotallimit = 5;
    public static Shape getShape(int type) {
            switch (type) {
                case CIRCLE:
                if (countCircle < countCirclelimit && countTotal < countTotallimit) {
                    countCircle++;
                    countTotal++;
                    return new Circle();
                } else {
                    System.out.println("Circle limit reached");
                    return null;
                    
                }
                case RECTANGLE:
                if (countRectangle < countRectanglelimit && countTotal < countTotallimit) {
                    countRectangle++;
                    countTotal++;
                    return new Rectangle();
                } else {
                    System.out.println("Rectangle limit reached");
                    return null;
                    
                }
                case SQUARE:
                if (countSquare < countSquarelimit && countTotal < countTotallimit) {
                    countSquare++;
                    countTotal++;
                    return new Square();
                } else {
                    System.out.println("Square limit reached");
                    return null;
                }
                default:
                    return null;
            }
     
        }
}