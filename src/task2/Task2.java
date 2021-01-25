package task2;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class Task2 {
    public static void start(){
        /*
        Supplier - на вход ничего не передается, но нужно что-то вернуть (метод get)
         */
        String string = "qwertyuiop";
        Supplier<String> stringSupplier = () -> string.substring(3);
        System.out.println(stringSupplier.get());

        /*
        Predicate - принимает значение, проверяет состояние и выдает boolean (методы: and, or, negate)
         */
        Predicate<Integer> isMoreThan15 = j -> j > 15;
        Predicate<Integer> isEquals15 = j -> j == 15;
        System.out.println(isMoreThan15.test(1));
        System.out.println(isMoreThan15.test(16));
        System.out.println(isMoreThan15.or(isEquals15).test(15));

        //////////////////////////////////////////////////////////////
        //Использование своего функционального интерфейса
        String string1 = "wrwer;;";
        String string2 = "666";

        MyFuncInterface<String> sumOfStrings = (q1, q2) -> q1 + q2;
        System.out.println(sumOfStrings.calculate(string1, string2));

        Integer int1 = 4;
        Integer int2 = -1234;
        MyFuncInterface<Integer> sumOfInts = (q1, q2) -> q1 + q2;
        System.out.println(sumOfInts.calculate(int1, int2));

        // Использование дефолтных методов
        System.out.println(sumOfInts.kek());
        System.out.println(sumOfInts.calc(int1, int2));

        // Использование статического метода
        MyFuncInterface.hello();
    }
}
