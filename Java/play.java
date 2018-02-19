import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.io.*;

public class play{
    private int m = 10;
    private String tony;
    int x = 27;
    int y = 12;
    int money;

    public int getMoney(){
        return x;
    }

    public void setMoney(int money){
        this.money = money;
    }

    public void tryConnect(){
        try{
            URL url = new URL("http://www.google.com");
            URLConnection urlConnection = url.openConnection();
            // BufferedReader br = new BufferedReader( new InputStreamReader( urlConnection.getInputStream()));
            BufferedReader br = new BufferedReader(   new InputStreamReader(    urlConnection.getInputStream()));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        }
        catch (IOException ex) {
            // Handles exceptions

        }
    }
    public static void main(String[] args){
        // SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println("Sitting in the airport on " + date.toString());
        System.out.println();
        play pp = new play();
        System.out.println(pp.getMoney());
        pp.setMoney(110);
        System.out.println("After set: " + pp.money);

        String url = "http://www.google.com";

        if(url.startsWith("http:")){
            System.out.println("You are using unsecure connection: http --" + url);
        } else {
            System.out.println("You have a secure connection: http(s) --" + url);
        }
    }
}