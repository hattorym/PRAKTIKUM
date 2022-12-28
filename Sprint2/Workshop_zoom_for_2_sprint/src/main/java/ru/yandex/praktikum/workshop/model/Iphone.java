package ru.yandex.praktikum.workshop.model;

public class Iphone extends Product {
    String model;

    public Iphone(int amount, int price, String model) {
        super(amount, price, false);
        this.model = model;

    }

    @Override
    public double getDiscount() {
        if (model.equals("13")) {
            return 80;

        }
        return 0;
    }
}
