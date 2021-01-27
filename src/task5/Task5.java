package task5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void start(){
        A a1 = new A("qwe", 123, false);
        A a2 = new A("asd", 456, true);
        A a3 = new A("zxc", 789, false);
        A a4 = new A("енг", 776, true);
        A a5 = new A("ghj", 777, false);

        List<A> aList = new ArrayList<>();
        aList.add(a1);
        aList.add(a2);
        aList.add(a3);
        aList.add(a4);
        aList.add(a5);

//        supplier: создает объект коллекции
//        accumulator: добавляет элемент в коллекцию
//        combiner: бинарная функция, которая объединяет два объекта

//        Collector<A, ArrayList<A>, ArrayList<A>> myCollector = Collector.of(
//                () -> new ArrayList<A>(),  //создание нового листа
//                (list, item) -> list.add(item),   //добавление эл-та в список
//                (list1, list2) -> list1.addAll(list2)   //добавление списка в другой список
//        );

        ArrayList<A> aArrayList = aList.stream()
                .collect(ACollector.toACollector());

        System.out.println(aArrayList);

        /*
        Юзание параллельного стрима
         */
        ArrayList<A> aArrayList2_0 = aList.parallelStream()
                .collect(ACollector.toACollector());

        System.out.println(aArrayList2_0);
    }
}
