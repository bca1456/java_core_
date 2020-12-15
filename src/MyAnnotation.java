import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String author() default "Zhenya";
    int key() default 1;
    String comments();
}
