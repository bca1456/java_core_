import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

/**
 * Reading file with StreamTokenizer
 */
public class StreamTokenizerExample {
    public static void getExample(){
        System.out.println("=StreamTokenizer=");
        String file = "res/qwe.txt";
        try {
            FileReader fileReader = new FileReader(file);
            StreamTokenizer tokenizer = new StreamTokenizer(fileReader);

            int line;
            while ((line = tokenizer.nextToken()) != tokenizer.TT_EOF){
                System.out.println(tokenizer.sval);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("=End of StreamTokenizer=");
    }
}
