public class ShapeTest {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape("SQUARE");
        if (square != null) {
            square.draw();
            System.out.println();
        }

        Shape circle = shapeFactory.getShape("CIRCLE");
        if (circle != null) {
            circle.draw();
            System.out.println();
        }

        Shape rectangle = shapeFactory.getShape("RECTANGLE");
        if (rectangle != null) {
            rectangle.draw();
            System.out.println();
        }

        Shape triangle = shapeFactory.getShape("TRIANGLE");
        if (triangle != null) {
            triangle.draw();
            System.out.println();
        }

        Shape invalidShape = shapeFactory.getShape("PENTAGON");
        if (invalidShape != null) {
            invalidShape.draw();
        }
    }
}
