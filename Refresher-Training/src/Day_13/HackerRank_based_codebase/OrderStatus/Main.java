package Day_13.HackerRank_based_codebase.OrderStatus;

public class Main {
    public static void main(String[] args) {

        OrderStatus status = OrderStatus.PLACED;

        System.out.println("Order Status: "+status);
        System.out.println("Is Final: "+status.isFinal());

        status = OrderStatus.SHIPPED;

        System.out.println("Order Status: " +status);
        System.out.println("Is Final: "+status.isFinal());

        status = OrderStatus.DELIVERED;

        System.out.println("Order Status: "+status);
        System.out.println("Is Final: " +status.isFinal());
    }
}
