package task5;


import java.util.ArrayList;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class ACollector /*implements Collector<Integer, Integer, Integer>*/ {

    /*private int size;

    public ACollector(int size) {
        this.size = size;
    }

    @Override
    public Supplier<Integer> supplier() {
        return (Supplier<Integer>) new ArrayList<Integer>();
    }

    @Override
    public BiConsumer<Integer, Integer> accumulator() {
        return Integer::compareTo;
    }

    @Override
    public BinaryOperator<Integer> combiner() {
        return Integer::compareTo;
    }

    //трансформирует аккумулятор в финальный резалт
    @Override
    public Function<Integer, Integer> finisher() {
        return Function.identity();
    }

    @Override
    public Set<Characteristics> characteristics() {
        return null;
    }

    public static ACollector toA(int bucketSize) {
        return new ACollector(bucketSize);
    }*/
}
