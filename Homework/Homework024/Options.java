package Homework.Homework024;

/*
 * класс для указания наличия опций в автомобиле. в классическом варианте рекомендуется
 * использовать <String, Boolean>
 */
public class Options<T, V> {

    T option;
    V option2;

    public Options(T option, V option2) {
        this.option = option;
        this.option2 = option2;
    }

    T getOptionName() {
        return option;
    }

    V getOptionPresence() {
        return option2;
    }

}
