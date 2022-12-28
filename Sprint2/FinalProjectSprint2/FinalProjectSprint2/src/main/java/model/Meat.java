//Класс Meat — для мяса. Это класс с конструктором.
//Конструктор принимает два входных параметра — количество и цену.
//И устанавливает для флага isVegetarian правильное значение.

package model;

public class Meat extends Food {
    public Meat(int amount, double price, boolean isVegetarian) {
        super(amount, price, isVegetarian);
    }

    @Override
    public double getDiscount() {
        return 0;
    }
}
