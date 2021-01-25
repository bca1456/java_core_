package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Task1 {
    public static void start(){
        //Создание объектов
        Person person1 = new Person("Peter", 24);
        Person person2 = new Person("John", 13);
        Person person3 = new Person("Winston", 4);
        Person person4 = new Person("Danny", 19);

        //Создание коллекции/добавление элементов
        List<Person> personArrayList = new ArrayList<>();
        personArrayList.add(person1);
        personArrayList.add(person2);
        personArrayList.add(person3);
        personArrayList.add(person4);

        System.out.println(personArrayList);
        for (Person a: personArrayList) {
            System.out.println(a);
        }

        //Сортировка по имени
        personArrayList.sort(Comparator.comparing(Person::getName));
        System.out.println("Sort by name");
        for (Person a: personArrayList) {
            System.out.println(a);
        }

        //Сортировка по возрасту
        personArrayList.sort(Comparator.comparing(Person::getAge));
        System.out.println("Sort by age");
        for (Person a: personArrayList) {
            System.out.println(a);
        }
    }
}
