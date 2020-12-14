//Parent.java
public class Person<T, I>{
    private T name;
    private I age;

    public Person(T name, I age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    public I getAge() {
        return age;
    }

    public void setAge(I age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name=" + name +
                ", age=" + age +
                '}';
    }
}
