package com.inheritance.multilevel.onlineretail;

public class Main {

    public static void main(String[] args) {

        Order o1 = new Order("ORD101", "10-Jan-2026");
        Order o2 = new ShippedOrder("ORD102", "11-Jan-2026", "TRK8899");
        Order o3 = new DeliveredOrder("ORD103", "12-Jan-2026", "TRK9900", "15-Jan-2026");

        System.out.println(o1.getOrderStatus());
        System.out.println(o2.getOrderStatus());
        System.out.println(o3.getOrderStatus());
    }
}