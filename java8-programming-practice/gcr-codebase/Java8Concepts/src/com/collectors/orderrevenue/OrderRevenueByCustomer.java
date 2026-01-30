package com.collectors.orderrevenue;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OrderRevenueByCustomer {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(
                new Order("O101", "Prashant", 45000),
                new Order("O102", "Ananya", 12000),
                new Order("O103", "Prashant", 30000),
                new Order("O104", "Rahul", 8000),
                new Order("O105", "Ananya", 15000)
        );

        Map<String, Double> revenueByCustomer = orders.stream()
                .collect(Collectors.groupingBy(
                        Order::getCustomerName,
                        Collectors.summingDouble(Order::getOrderAmount)
                ));

        System.out.println("Order Revenue Summary (Per Customer)");
        System.out.println("------------------------------------");

        revenueByCustomer.forEach((customer, total) ->
                System.out.printf("%-10s : %.2f%n", customer, total)
        );
    }
}
