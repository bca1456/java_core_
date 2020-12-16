import extendsThreadWithSynchronizedCodeBlockExample.ClientTWSCB;

public class Main {
    public static void main(String[] args){
        /**
         * Суть в том, что создается мейн поток и 1 дочерний.
         * Дочерний каждые 250 мс просыпается и увеличивает счетичик,
         * а мейн поток просыпается каждые 1000мс и просто читает переменную-счетчик
         */
//        Client client = new Client();
//        client.getRunnableExample();

//        System.out.println("==============");

        /**
         * Такая же суть, но поток создается наследованием от Thred,
         * но рофл в том, что надо сделать синхронизированный доступ к переменной
         */
//        ClientT clientT = new ClientT();
//        clientT.getExample();

//        System.out.println("==============");

        /**
         * Такая же суть, но поток создается наследованием от Thread,
         * с созданным синхронизированным методом
         */
//        ClientTWS clientTWS = new ClientTWS();
//        clientTWS.getExample();

        /**
         * Такая же суть, но поток создается наследованием от Thread,
         * с созданным синхронизированным доступом к переменной + каждый поток смотрит на свою переменную
         * и если она четная, то добавляет в лист
         */
        ClientTWSCB clientTWSCB = new ClientTWSCB();
        clientTWSCB.getExample();
    }
}


