package com.exxcellent;

import com.exxcellent.fileReader.ReaderImpl.CsvFileReader;
import com.exxcellent.strategy.strategyImpl.FootballStrategy;
import com.exxcellent.strategy.strategyImpl.WeatherStrategy;
import org.junit.Assert;
import org.junit.Test;

public class TestFootballStrategy {

    @Test
    public void testAct(){
        String url = "D:\\mvn-workplace\\weihuang\\src\\main\\resources\\football.csv";
        CsvFileReader reader = new CsvFileReader();
        FootballStrategy strategy = new FootballStrategy();
        FileProcessing filePro = new FileProcessing(url, reader, strategy);
        filePro.act();

        Assert.assertEquals("Aston_Villa",strategy.getTeamName());
    }
}
