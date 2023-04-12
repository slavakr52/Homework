package Homework.Homework024;

/*
 * класс для указания стоимости авто. в случае отсутствия стоимости можем использовать String 
 * например: "Цена не указана". если цена есть, используем, например, Integer
 */
public class Price<T> {

    T price;

    public Price(T price) {
        this.price = price;
    }

    T getPrice() {
        return price;
    }
}
