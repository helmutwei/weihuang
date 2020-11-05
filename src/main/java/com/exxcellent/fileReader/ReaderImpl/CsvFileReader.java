package com.exxcellent.fileReader.ReaderImpl;

import com.exxcellent.fileReader.MyFileReader;

import java.io.*;
import java.util.Collection;


public class CsvFileReader implements MyFileReader {

    @Override
    public void readFile(String url, Collection<String> collection) {
        File csv = new File(url);
        try {
            BufferedReader textFile = new BufferedReader(new FileReader(url));
            String line = "";

            while ((line = textFile.readLine()) != null){
                collection.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
