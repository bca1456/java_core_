import ex.SynchCollections;
import ex.SynchList;

public class Main {
    public static void main(String[] args){
        /**
         * Метод создает Collections.synchronizedCollection + создаются потоки, кот. пишут в эту коллекцию
         */
        SynchCollections.getExample();

        /**
         * Метод создает Collections.synchronizedList + потоки
         */
        SynchList.getExample();


    }
}


