package com.exxcellent;

import com.exxcellent.fileReader.MyFileReader;
import com.exxcellent.fileReader.ReaderImpl.CsvFileReader;
import com.exxcellent.strategy.MyStrategy;
import com.exxcellent.strategy.strategyImpl.WeatherStrategy;
import org.junit.Assert;
import org.junit.Test;

public class TestFileProcessing {

    @Test
    public void testAct(){
        String url = "D:\\mvn-workplace\\weihuang\\src\\main\\resources\\weather.csv";
        CsvFileReader reader = new CsvFileReader();
        WeatherStrategy strategy = new WeatherStrategy();
        FileProcessing filePro = new FileProcessing(url, reader, strategy);
        filePro.act();

        Assert.assertEquals(2,strategy.getResult());
    }
}
