import domain.Bird;
import domain.Dog;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args){
        Bird bird1 = new Bird("bird1");
        Bird bird2 = new Bird("bird2");
        Dog dog1 = new Dog("dog1");
        Dog dog2 = new Dog("dog2");

        System.out.println(bird1);
//        System.out.println(bird2);
//        System.out.println(dog1);
//        System.out.println(dog2);

        try {
            FileOutputStream outputStream = new FileOutputStream("res/qwe.bin");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            // сохраняем игру в файл
            objectOutputStream.writeObject(bird1);
//            objectOutputStream.writeObject(bird2);
//            objectOutputStream.writeObject(dog1);
//            objectOutputStream.writeObject(dog2);
            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream("res/qwe.bin");
            String line;
            BufferedReader bufferedReader = new BufferedReader(new FileReader("res/qwe.bin"));
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Bird birdFromHell = (Bird) objectInputStream.readObject();

            System.out.println(birdFromHell);

            objectInputStream.close();
        } catch (IOException | ClassNotFoundException io){
            io.printStackTrace();
        }
    }
}


