package pl.dietmanager.data;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class MeasurementsReader {
    public List<String> readFromFile(String path){
        List<String> lines = new ArrayList<String>();
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader(path));
            while ((line = br.readLine()) != null ) {
                lines.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lines;
    }
}
