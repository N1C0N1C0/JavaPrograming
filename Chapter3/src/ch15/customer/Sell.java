package ch15.customer;

public interface Sell {
    void sell();

    default void order() {
        System.out.println("sell order");
    }
}
