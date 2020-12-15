import java.io.*;

/**
 * Reading file by default bufferedReader
 */
public class IOExample {
    public static void readFile(){
        System.out.println("=IOExample=");
        String file = "res/qwe.txt";
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String curLine;
            while((curLine = bufferedReader.readLine()) != null) {
                System.out.println(curLine);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=End of IOExample=");
    }
}
