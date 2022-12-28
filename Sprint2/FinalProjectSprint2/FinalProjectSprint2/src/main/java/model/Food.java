//Класс Food — абстрактный класс с полями:
//amount — количество продукта в килограммах (целое число);
//price — цена за единицу (вещественное число);
//isVegetarian — флаг, который показывает, вегетарианский ли продукт.
//Поля должны быть доступны только из классов-потомков.
//Наследники класса Food: Meat и Apple

package model;

import static model.constants.Discount.CURRENT_DISCOUNT;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean isVegetarian;


    protected Food(int amount, double price, boolean isVegetarian) {
        this.amount = amount;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public double getTotalPrice() {
        return amount * price;
    }

    public double getTotalPriceWithDiscount() {
        if (getDiscount() == 0) {
            return getTotalPrice();
        }
        return getTotalPrice() - CURRENT_DISCOUNT * getTotalPrice() / 100;
    }

    public double getPriceVegetarian() {
        if (isVegetarian) {
            return getTotalPrice();
        }
        return 0;
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}

