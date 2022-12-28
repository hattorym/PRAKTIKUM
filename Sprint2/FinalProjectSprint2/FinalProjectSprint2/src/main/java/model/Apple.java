//Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
//Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.
//Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.

package model;

import static model.constants.Colour.RED_APPLE;
import static model.constants.Discount.CURRENT_DISCOUNT;

public class Apple extends Food {
    String colour;

    public Apple(int amount, double price, boolean isVegetarian, String colour) {
        super(amount, price, isVegetarian);
        this.colour = colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(RED_APPLE)) {
            return CURRENT_DISCOUNT;
        }
        return 0;
    }

}