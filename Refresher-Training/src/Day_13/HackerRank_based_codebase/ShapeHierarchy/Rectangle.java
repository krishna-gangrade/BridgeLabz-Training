package Day_13.HackerRank_based_codebase.ShapeHierarchy;

class Rectangle extends Shape {

    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }
}
