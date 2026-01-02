
package com.encapsulation.ecommerceplatform;

class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10;
    }

    @Override
    public double calculateTax(double price) {
        return price * 0.18;
    }

    @Override
    public String getTaxDetails() {
        return "GST @18%";
    }
}
