//В методе main реализуй следующую логику:
//Инициализируй данные. Для этого создай объекты:
//Мясо в количестве 5 кг по цене 100 рублей за кг;
//Яблоки красные в количестве 10 кг по цене 50 рублей;
//Яблоки зелёные в количестве 8 кг по цене 60 рублей.
//Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
//Посчитай и выведи на экран значения для созданной корзины:
//общую сумму товаров без скидки,
//общую сумму товаров со скидкой,
//сумму всех вегетарианских продуктов без скидки.
//Все переменные класса должны быть недоступны извне, если не указано иное.
//Доступ к ним реализуй через известные тебе методы: создавай только те,
//которые действительно нужны для реализации описанной функциональности.

import model.Apple;
import model.Food;
import model.Meat;
import service.ShoppingCart;

import static model.constants.Colour.GREEN_APPLE;
import static model.constants.Colour.RED_APPLE;


public class Main {
    public static void main(String[] args) {
        Food[] myFood = {
                new Meat(5, 100, false),
                new Apple(10, 50, true, RED_APPLE),
                new Apple(8, 60, true, GREEN_APPLE),
        };

        ShoppingCart shoppingCart = new ShoppingCart(myFood);

/*
        System.out.println("Всего товаров на сумму: " + shoppingCart.getTotalPrice());
        System.out.println("Сумма товаров с учетом скидки: " + shoppingCart.getTotalPriceWithDiscount());
        System.out.println("Всего всех вегетарианских продуктов без скидки: " + shoppingCart.getPriceVegetarian());
*/

      System.out.printf("Всего товаров на сумму: %.2f %n", shoppingCart.getTotalPrice());
      System.out.printf("Сумма товаров с учетом скидки: %.2f %n", shoppingCart.getTotalPriceWithDiscount());
      System.out.printf("Всего всех вегетарианских продуктов без скидки: %.2f %n", shoppingCart.getPriceVegetarian());
    }
}