package com.exxcellent.strategy.strategyImpl;

import com.exxcellent.strategy.MyStrategy;

import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

public class FootballStrategy implements MyStrategy {
    private String teamName;
    @Override
    public void inspect(Collection<String> c) {
        int index = 1, goals = 0, goalsAllowed = 0;
        Iterator<String> iter = c.iterator();
        String line = iter.next();
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter(",");
        String data = "";
        teamName = scanner.next();
        while (scanner.hasNext()){
            data = scanner.next();
            if(index == 5){goals = Integer.parseInt(data);}
            else if (index == 6){goalsAllowed = Integer.parseInt(data);}
            index++;
        }
        index = 1;
        int result = Math.abs(goalsAllowed - goals);

        while (iter.hasNext()){
            line = iter.next();
            scanner = new Scanner(line);
            scanner.useDelimiter(",");
            String tempName = scanner.next();
            while (scanner.hasNext()){
                data = scanner.next();
                if(index == 5){goals = Integer.parseInt(data);}
                else if (index == 6){goalsAllowed = Integer.parseInt(data);}
                index++;
            }
            if(Math.abs(goalsAllowed - goals) < result) {
                result = Math.abs(goalsAllowed - goals);
                teamName = tempName;
            }
            index = 1;
        }

        System.out.println("The team with the smallest distance is " + teamName);
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

    public String getTeamName() {
        return teamName;
    }
}
