package ru.yandex.praktikum.workshop.model;

public abstract class Product implements Discountable {
    public double amount;
    public int price;
    public boolean isFresh;

    protected Product(int amount, int price, boolean isFresh) {
        this.amount = amount;
        this.price = price;
        this.isFresh = isFresh;
    }

    public double getTotalPriceWithDiscount() {
        if (getDiscount() == 0) {
            return getTotalPrice();
        }

        return calculate();
    }

    private double calculate() {
        return getDiscount() / 100 * getTotalPrice();
    }

    public double getTotalPrice() {
        return amount * price;
    }


    @Override
    public double getDiscount() {
        return 0;
    }
}