package Day_13.HackerRank_based_codebase.OverloadingOverriding;

public class Shape2D extends Shape {

    @Override
    void draw(){
        System.out.println("Drawing a 2D Shape");
    }

    void draw(String color){
        System.out.println("Drawing a 2D Shape with color: "+color);
    }
}
