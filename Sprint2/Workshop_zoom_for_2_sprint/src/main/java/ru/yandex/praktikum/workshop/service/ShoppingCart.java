package ru.yandex.praktikum.workshop.service;

import ru.yandex.praktikum.workshop.model.Product;

public class ShoppingCart {
    private Product[] products;

    public ShoppingCart(Product[] products) {
        this.products = products;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public Product[] getProducts() {
        return products;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice = totalPrice + products[i].getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (int i = 0; i < products.length; i++) {
            totalPrice = totalPrice + products[i].getTotalPriceWithDiscount();
        }
        return totalPrice;
    }
}