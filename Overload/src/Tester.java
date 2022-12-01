public class Tester {
    public static void main(String[] args) {
        Shape undefined = new Shape();
        Shape circle = new Shape(7.5);
        Shape square = new Shape(4, 4.5);
        Shape rectangle = new Shape(4,2.5, 3);
        Shape triangle = new Shape(3,2.5,2.7,3.1);

        String undefinedDetails =  undefined.getShapeDetails();
        String circleDetails = circle.getShapeDetails();
        String squareDetails = square.getShapeDetails();
        String rectangleDetails = rectangle.getShapeDetails();
        String triangleDetails =  triangle.getShapeDetails();

        System.out.println(undefinedDetails);
        System.out.println(circleDetails);
        System.out.println(squareDetails);
        System.out.println(rectangleDetails);
        System.out.println(triangleDetails);
    }
}
