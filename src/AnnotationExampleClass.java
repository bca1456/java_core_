public class AnnotationExampleClass {

    @MyAnnotation(author = "Oleg", comments = "just an example", key = 666)
    public static String getExample(){
        return "Example";
    }

    @Deprecated
    @MyAnnotation(comments = "deprecated method", key = -1)
    public static void oldMethod(){
    }
}
