package com.exxcellent;

import com.exxcellent.fileReader.ReaderImpl.CsvFileReader;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class TestCsvFileReader {

    @Test
    public void testReadFile(){
        String url = "D:\\mvn-workplace\\weihuang\\src\\main\\resources\\weather.csv";
        List<String> collection = new ArrayList<>();

        CsvFileReader reader = new CsvFileReader();
        reader.readFile(url, collection);
        collection.forEach(line -> System.out.println(line));
    }
}
