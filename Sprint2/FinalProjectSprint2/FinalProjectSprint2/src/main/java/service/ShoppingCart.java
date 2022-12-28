//Пакет service. В нём создай класс для корзины — ShoppingCart.
//Добавь в него поле — массив элементов из объектов типа Food.
//Понадобится конструктор с одним параметром — массивом элементов Food.
//С его помощью ты создашь объект корзины.
//В классе ShoppingCart реализуй методы для работы с корзиной:
//получить общую сумму товаров в корзине без скидки,
//получить общую сумму товаров в корзине со скидкой,
//получить общую сумму всех вегетарианских продуктов в корзине без скидки.

package service;

import model.Food;

public class ShoppingCart {

    private final Food[] food;

    public ShoppingCart(Food[] myFood) {
        this.food = myFood;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        for (Food value : food) {
            totalPrice = totalPrice + value.getTotalPrice();
        }
        return totalPrice;
    }

    public double getTotalPriceWithDiscount() {
        double totalPrice = 0;
        for (Food value : food) {
            totalPrice = totalPrice + value.getTotalPriceWithDiscount();
        }
        return totalPrice;
    }

    public double getPriceVegetarian() {
        double priceVegetarian = 0;
        for (Food value : food) {
            priceVegetarian = priceVegetarian + value.getPriceVegetarian();
        }
        return priceVegetarian;
    }
}
