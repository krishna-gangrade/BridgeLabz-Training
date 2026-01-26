
/*
9. TailorShop – Sorting Orders by Delivery Deadline (Insertion Sort)
Story: At a tailor’s shop, new clothing orders are received every hour. Each order has a
deadline, and the owner maintains a sorted list of orders by delivery date. Since each new
order is inserted into a nearly sorted list, Insertion Sort is simple and fast.
Concepts Involved:
● Insertion Sort
● Real-time updates
● Deadline-based sorting
*/

package com.day9.tailorshop;

public class TailorShopApp {
	public static void main(String[] args) {
		TailorShopManager shop = new TailorShopManager();

		System.out.println("============================================================");
		System.out.println("        New orders arriving throughout the day");
		System.out.println("============================================================\n");

		shop.addOrder(new Order(101, "Rohit Mehta", "Designer Kurta", "2026-02-05"));
		shop.showPendingOrders();

		shop.addOrder(new Order(102, "Ananya Iyer", "Silk Saree", "2026-02-02"));
		shop.showPendingOrders();

		shop.addOrder(new Order(103, "Kunal Malhotra", "Sherwani", "2026-02-08"));
		shop.showPendingOrders();

		shop.addOrder(new Order(104, "Pooja Nair", "Palazzo Suit", "2026-02-01"));
		shop.showPendingOrders();

		shop.addOrder(new Order(105, "Arjun Rao", "Blazer Set", "2026-02-04"));
		shop.showPendingOrders();

		shop.addOrder(new Order(106, "Meera Kulkarni", "Festive Gown", "2026-02-03"));
		shop.showPendingOrders();
		
		System.out.println("All orders added. Shop is ready to prioritize earliest deadlines!");
	}
}
