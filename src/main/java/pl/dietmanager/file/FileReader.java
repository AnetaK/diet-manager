package pl.dietmanager.file;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;

public class FileReader {
    public List<String> readFromFile(String path){
        List<String> lines = new ArrayList<String>();
        String line = "";
        try{
            BufferedReader br = new BufferedReader(new java.io.FileReader(path));
            while ((line = br.readLine()) != null ) {
                lines.add(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return lines;
    }
}
