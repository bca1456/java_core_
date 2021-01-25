package task3;

public class Task3 {
    public static void start() {
        // Использование лямбды с тремя интами
        ThreeFunction<Integer> getSum = (q1, q2, q3) -> (q1 + q2 + q3);
        Integer num1 = 123;
        Integer num2 = 23;
        Integer num3 = -123;
        System.out.println(getSum.getResult(num1, num2, num3));

        //Использование лямбды с тремя стрингами
        ThreeFunction<String> getCommonString = (s1, s2, s3) -> ((s1.concat(s2)).concat(s3));
        String str1 = "aaa";
        String str2 = "bbb";
        String str3 = "ccc";
        System.out.println(getCommonString.getResult(str1, str2, str3));
    }
}
