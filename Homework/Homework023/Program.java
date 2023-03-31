import java.util.ArrayList;
import java.util.List;

/*
 * Реализовать, с учетом ооп подхода, генеалогическое дерево Человек.
Идея: описать некоторое количество компонент, например:
модель человека
компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д.
компонент для проведения исследований
дополнительные компоненты по желанию, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека
Под “проведением исследования” можно понимать получение всех детей выбранного человека.
 */

public class Program {

    public static void main(String[] args) {

        Grandparents grandma = new Grandparents("Tatyana", 60);
        Grandparents granddad = new Grandparents("Sergey", 64);
        Parents dad = new Parents("Dmitry", 44);
        Childrens son = new Childrens("Aleks", 13);
        Childrens daughter = new Childrens("Sveta", 11);

        List<Human> array = new ArrayList<>();

        array.add(grandma);
        array.add(granddad);
        array.add(dad);
        array.add(son);
        array.add(daughter);

        getAllInfo(dad, array); // меняем в этом методе человека и узнаём информацию по нему и его родителям

    }

    public static void getAllInfo(Human familyUnit, List array) {
        System.out.println(familyUnit.getInfo());
        getParents(array, familyUnit);
    }

    public static void getParents(List array, Human familyUnit) { // array - все родственники, familyUnit - член семьи,
                                                                  // для которого будем искать родителей
        String parentsClass = familyUnit.getClass().getSuperclass().getName().toString();
        for (int i = 0; i < array.size(); i++) {
            if (array.get(i).getClass().getName().toString() == parentsClass) {
                System.out.println(((Human) array.get(i)).getParentsInfo());
            }
        }
    }
}
