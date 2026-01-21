
/*   4. FlashDealz – Product Sorting by Discount (Quick Sort)
Story: An e-commerce platform runs a flash sale with millions of products, each offering
different discounts. Users want to see the top discounted products instantly. To quickly sort
such large data, the backend uses Quick Sort, known for its fast average-case performance
and efficiency.
Concepts Involved:
● Quick Sort
● Large unsorted data
● Performance optimization
  */


package com.day7.flashdealz;

public class FlashDealzApp {

	public static void main(String[] args) {

        DealProduct[] products = {
            new DealProduct(201, "Smartphone", 30000, 30),
            new DealProduct(202, "Laptop", 60000, 45),
            new DealProduct(203, "Earbuds", 5000, 60),
            new DealProduct(204, "Smart TV", 45000, 25),
            new DealProduct(205, "Power Bank", 2000, 50)
        };

        System.out.println("Flash Sale Products (Before Sorting)");
        display(products);

        DiscountQuickSort.sortByDiscount(products, 0, products.length - 1);

        System.out.println("\nTop Discounted Products (After Quick Sort)");
        display(products);
    }

    private static void display(DealProduct[] products) {
        for (DealProduct product : products) {
            System.out.println(product);
        }
    }
}
