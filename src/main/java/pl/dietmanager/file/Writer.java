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
                writer.write(m.toString().replace("[","").replace("]","") + "\r\n");
                writer.flush();
            }

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
