package domain;

import java.io.Serializable;

public class Bird extends Animal implements Serializable {
    public String name;

    @Override
    public boolean isFlying() {
        return true;
    }

    @Override
    public int getEyesNumber() {
        return 2;
    }

    @Override
    public String eat() {
        return "Eating fruits";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Bird(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                "isFlying='" +isFlying() + '\''+
                "eyesNumber='" +getEyesNumber() + '\''+
                '}';
    }
}
