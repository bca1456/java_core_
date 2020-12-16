import extendsThreadExample.ClientT;
import extendsThreadWithSynchronizedExample.ClientTWS;
import runnableExample.Client;

public class main {
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
         * Такая же суть, но поток создается наследованием от Thred,
         * с созданным синхронизированным доступом
         */
        ClientTWS clientTWS = new ClientTWS();
        clientTWS.getExample();
    }
}


