package Day_12.HackerRank_based_codebase.OverloadedPizzaOrder;

public class Pizza {
    private String size;
    private String crustType;
    private int toppingsCount;
    private double price;

    public Pizza(String size){
        this(size,"Regular", 0);
    }
    public Pizza(String size, String crustType){
        this(size, crustType, 0);
    }
    public Pizza(String size, String crustType, int toppingsCount){
        this(size, crustType, toppingsCount, calculatePrice(size, toppingsCount));
    }

    public Pizza(String size, String crustType, int toppingsCount, double price){
        this.size= size;
        this.crustType= crustType;
        this.toppingsCount= toppingsCount;
        this.price= price;
    }

    private static double calculatePrice(String size, int toppingsCount){
        double basePrice;

        if(size.equalsIgnoreCase("Small")){
            basePrice= 150;
        }else if(size.equalsIgnoreCase("Medium")) {
            basePrice= 200;
        }else if(size.equalsIgnoreCase("Large")) {
            basePrice= 300;
        }else{
            basePrice= 175;
        }

        return basePrice+ (toppingsCount*10);
    }

    public void printPizza(){
        System.out.println("Size : "+ size +", Crust : "+ crustType+ ", Toppings : "+ toppingsCount+ ", Price : "+ price);
    }

    public static void main(String[] args) {

        Pizza p1= new Pizza("Small");
        Pizza p2= new Pizza("medium", "Thin");
        Pizza p3= new Pizza("Large", "Cheese Burst", 3);
        Pizza p4= new Pizza("Medium", "Regular", 2, 999);

        p1.printPizza();
        p2.printPizza();
        p3.printPizza();
        p4.printPizza();

    }

}
