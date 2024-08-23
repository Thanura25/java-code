public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null){
            square.drew();
            System.out.println();
        }

        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null){
            circle.drew();
            System.out.println();
        }

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null){
            rectangle.drew();
            System.out.println();
        }

        Shape triangle = shapeFactory.getShape("TRIANGLE");
        if (triangle != null){
            triangle.drew();
            System.out.println();
        }

        Shape invalidShape = shapeFactory.getShape("PENTAGON");
        if (invalidShape != null){
            invalidShape.drew();
        }
    }
}
