package Day_12.HackerRank_based_codebase.ReferenceVariableTrap;

public class Rectangle {

    int length;
    int width;

    Rectangle(int length, int width){
        this.length= length;
        this.width= width;
    }

    void scale(int factor){
        length= length* factor;
        width= width* factor;
    }

    public static void main(String[] args) {
        Rectangle rect1= new Rectangle(4,5);
        Rectangle rect2= rect1;

        rect2.scale(2);

        System.out.println("rect1 length: "+ rect1.length);
        System.out.println("rect1 width: "+ rect1.width);
        System.out.println("rect2 length: "+ rect2.length);
        System.out.println("rect2 width: "+ rect2.width);
    }
}


