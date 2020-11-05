package com.exxcellent;

import com.exxcellent.fileReader.MyFileReader;
import com.exxcellent.strategy.MyStrategy;

import java.util.ArrayList;
import java.util.List;

public class FileProcessing {
    private String url;
    private MyFileReader reader;
    private MyStrategy strategy;
    private List<String> collection;

    public FileProcessing(String url, MyFileReader reader, MyStrategy strategy) {
        this.url = url;
        this.reader = reader;
        this.strategy = strategy;
        this.collection = new ArrayList<>();
    }

    public void act(){
        reader.readFile(url, collection);
        strategy.inspect(collection);
    }
}
