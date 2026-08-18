package Day_13.HackerRank_based_codebase.OrderStatus;

public enum OrderStatus {
    PLACED,
    SHIPPED,
    DELIVERED,
    CANCELLED;

    boolean isFinal(){
        if (this ==DELIVERED || this ==CANCELLED) {
            return true;
        }
        return false;
    }
}
