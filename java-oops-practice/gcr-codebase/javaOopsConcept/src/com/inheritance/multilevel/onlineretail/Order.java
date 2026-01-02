package com.inheritance.multilevel.onlineretail;

class Order {

    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
    	System.out.println("Order Id. : " + orderId);
    	return "Order Placed";
    }
}