import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLExample {
    public static void getExample(){
        try {
            URL url = new URL("https://google.com");
            URLConnection urlConnection = url.openConnection();
            InputStream inputStream = urlConnection.getInputStream();
            String data = readFromInputStream(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static String readFromInputStream(InputStream inputStream) throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        while((line = bufferedReader.readLine()) != null){
            stringBuilder.append(line).append("\n");
        }
        return stringBuilder.toString();
    }
}
