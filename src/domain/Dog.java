package domain;

import java.io.Serializable;

public class Dog extends Animal implements Serializable {
    public String name;

    @Override
    public boolean isFlying() {
        return false;
    }

    @Override
    public int getEyesNumber() {
        return 2;
    }

    @Override
    public String eat() {
        return "Eating meat";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                "isFlying='" +isFlying() + '\''+
                "eyesNumber='" +getEyesNumber() + '\''+
                '}';
    }
}
