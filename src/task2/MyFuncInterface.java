package task2;

@FunctionalInterface
public interface MyFuncInterface<T> {
    T calculate(T t1, T t2);

    default String kek(){
        return "kek";
    }

    default Integer calc(int i, int j){
        return i + j;
    }

    static void hello(){
        System.out.println("hello");
    }
}
