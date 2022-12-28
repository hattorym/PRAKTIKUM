package ru.yandex.praktikum.workshop;

import ru.yandex.praktikum.workshop.model.Buckwheat;
import ru.yandex.praktikum.workshop.model.Iphone;
import ru.yandex.praktikum.workshop.model.Magazine;
import ru.yandex.praktikum.workshop.model.Product;
import ru.yandex.praktikum.workshop.service.ShoppingCart;

public class Main {
    //Реализовать корзину ru.yandex.praktikum.workshop.service.ShoppingCart - цена за все товары, цена со скидкой, цена товаров IsFresh
    //Реализовать класс ru.yandex.praktikum.workshop.model.Product - кол-во, цена за единицу товара и идендификатор доставки IsFresh
    //Реализовать интерфейс ru.yandex.praktikum.workshop.model.Discountable
    //


    public static void main(String[] args) {
        Product[] products = {
                new Iphone(1, 95000, "13"),
                new Buckwheat(2, 35, true),
                new Magazine(5, 160, false),


        };
        ShoppingCart shoppingCart = new ShoppingCart(products);
        System.out.println("Всего товаров на сумму: " + shoppingCart.getTotalPrice());
        System.out.println("Сумма товаров с учетом скидки: " + shoppingCart.getTotalPriceWithDiscount());

    }

}