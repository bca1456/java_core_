package task5;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/*
T - тип эл-тов стрима
A - тип объекта-хелпера, который собирает куски результата collect операции
R - тип результата collect операции
 */

public class ACollector implements Collector<A, ArrayList<A>, ArrayList<A>> {

    @Override
    public Supplier<ArrayList<A>> supplier() {
        return ()-> new ArrayList<>();
    }

    @Override
    public BiConsumer<ArrayList<A>, A> accumulator() {
        return (list, item) -> {
            if (item.getA() % 2 == 0){ //добавляем только эл-ты, у которых поле кратно 2
                list.add(item); //добавление эл-та в список
            }
        };
    }

    @Override
    public BinaryOperator<ArrayList<A>> combiner() {
        return (list1, list2) -> {
            list1.addAll(list2);   //добавление списка в другой список
            return list1;
        };
    }

    @Override
    public Function<ArrayList<A>, ArrayList<A>> finisher() {
        return Function.identity(); //будет возвращать всегда один и тот же экземпляр
    }

    @Override
    public Set<Characteristics> characteristics() {
        return Collections.singleton(Characteristics.UNORDERED);
    }

    public static ACollector toACollector(){
        return new ACollector();
    }
}
