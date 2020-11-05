package com.exxcellent.strategy.strategyImpl;

import com.exxcellent.strategy.MyStrategy;
import com.sun.org.glassfish.gmbal.ParameterNames;

import java.util.*;


/*
    This class WeatherStrategy implements the interface MyStrategy,
    and is responsible for managing the task of weather data.
* */
public class WeatherStrategy implements MyStrategy {
    private int result;

    /*
        Checks every element/String of the given collection,
        reads the max and min temperature and then calculates
        the difference between them both.
        The smallest difference is stored in the attribute result.

        The result will be printed out after all the elements have
        been checked. It is also possible to get the stored result
        using the method getResult()
    * */
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
        System.out.println("The smallest temperatur spread is " + result);
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
