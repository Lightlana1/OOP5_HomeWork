package OOP5;

import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    public static void logData(String msg){
        try(FileWriter file = new FileWriter("Log.log", true)){
            Date currentTime = new Date();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTime + ": "+ msg + "\n");
            file.append(sb);
        }
        catch (IOException e){
            throw new RuntimeException();
        }
    }
}
