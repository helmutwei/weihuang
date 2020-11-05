package com.exxcellent.strategy.strategyImpl;

import java.util.*;

public class WeatherStrategy implements com.exxcellent.strategy.MyStrategy {
    private int result;

    @Override
    public void inspect(Collection<String> c) {
        int index = 0, minTemp = 0, maxTemp = 0;
        Iterator<String> iter = c.iterator();
        String line = iter.next();
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(",");
        String data = "";
        while (scanner.hasNext()){
            data = scanner.next();
            if(index == 1){maxTemp = Integer.parseInt(data);}
            else if (index == 2){minTemp = Integer.parseInt(data);}
            else if (index > 2){break;}
            index++;
        }
        index = 0;
        result = maxTemp - minTemp;

        while (iter.hasNext()){
            line = iter.next();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            while (scanner.hasNext()){
                data = scanner.next();
                if(index == 1){maxTemp = Integer.parseInt(data);}
                else if (index == 2){minTemp = Integer.parseInt(data);}
                else if (index > 2){break;}
                index++;
            }
            if((maxTemp - minTemp) < result) {
                result = maxTemp - minTemp;}
            index = 0;
        }
    }

    @Override
    public void add(Collection<String> c, String str) {

    }

    @Override
    public void delete(Collection<String> c, String str) {

    }

    @Override
    public void substitute(Collection<String> c, String str) {

    }

    public int getResult() {
        return result;
    }
}
