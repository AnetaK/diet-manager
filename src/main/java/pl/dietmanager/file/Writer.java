package pl.dietmanager.file;

import pl.dietmanager.model.Measurements;

import java.io.*;
import java.util.List;

public class Writer {
    public void writeToFile(String path, List<Measurements> measurements) {

        FileWriter writer = null;
        try {
            writer = new FileWriter(path, true);
            for (Measurements m :
                    measurements) {
                writer.write("\r\n"+m.toString().replace("[","").replace("]","") );
                writer.flush();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
