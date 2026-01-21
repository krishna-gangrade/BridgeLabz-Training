
package com.day7.flashdealz;

public class DealProduct {

    int productCode;
    String productName;
    double originalPrice;
    double discount;

    public DealProduct(int productCode, String productName,
                       double originalPrice, double discount) {
        this.productCode = productCode;
        this.productName = productName;
        this.originalPrice = originalPrice;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public double getDiscountedPrice() {
        return originalPrice - (originalPrice * discount / 100);
    }

    @Override
    public String toString() {
        return "ProductCode: " + productCode +
               ", Name: " + productName +
               ", Original Price: ₹" + originalPrice +
               ", Discount: " + discount + "%" +
               ", Final Price: ₹" + getDiscountedPrice();
    }
}
