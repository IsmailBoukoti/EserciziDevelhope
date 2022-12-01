public class Shape {
    String shapeName;
    int numberOfEdges;

    public Shape() {
        System.out.println("The object is being created ");
        this.shapeName = "Undefined shape";
    }

    public Shape(double radius) {
        System.out.println("The object is being created ");
        this.shapeName = "Circle shape";
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("The object is being created ");
        this.shapeName = "Square shape";
        this.numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("The object is being created ");
        this.shapeName = "Rectangle shape";
        this.numberOfEdges = edges;
    }

    public Shape(int edges, double e1,double e2, double e3) {
        System.out.println("The object is being created ");
        this.shapeName = "Triangle shape";
        this.numberOfEdges = edges;
    }
    public String getShapeDetails(){
        return "The object has " + shapeName + "" + " and it has " + numberOfEdges + " edges";
    }
}

