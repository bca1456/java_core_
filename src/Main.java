import java.util.*;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> coll = new ArrayList<>();
        coll.add(1);
        coll.add(0);
        coll.add(-3);
        coll.add(5);
        System.out.println(joinNumbers(coll));
    }



    // Берет поэлементно значения из коллекции from, преобразует их с помощью функции transformer
// и возвращает список результатов преобразования в том же порядке.
    public static <F, T> List<T> map(Collection<F> from, Function<? super F, ? extends T> transformer) {
        ArrayList<T> result = new ArrayList<T>();
        for (F element : from)
            result.add(transformer.apply(element));
        return result;
    }

    // Берет коллекцию произвольных элементов и конкатенирует их в строку
    public static <T> String join(Collection<T> from, String separator) {
        StringBuilder result = new StringBuilder();
        boolean first = true;
        for (T element : from) {
            if (first)
                first = false;
            else
                result.append(separator);
            result.append(element);
        }
        return result.toString();
    }


    public static String joinNumbers(Collection<? extends Integer> numbers) {
        // Объявляем "функцию", присваиваем ее переменной intToString.
        Function<Integer, String> intToString = new Function<Integer, String>() {
            @Override public String apply(Integer from) {
                return from.toString();
            }
        };
        return join(map(numbers, intToString), ", ");
    }
}


