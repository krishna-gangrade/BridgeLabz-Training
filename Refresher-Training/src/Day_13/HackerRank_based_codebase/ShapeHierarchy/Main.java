package Day_13.HackerRank_based_codebase.ShapeHierarchy;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = {
                new Circle(5),
                new Rectangle(10, 4),
                new Triangle(6, 8)
        };

        for(Shape shape : shapes){
            System.out.println("Area = " + shape.area());
        }
    }
}