package com.company;

public class Main {

    public static void main(String[] args) {
        MovingAverageContainer mvg = new MovingAverageContainer(new MovingAverageCalculator(5));
        mvg.add(4.0);
        mvg.add(4.0);
        mvg.add(4.0);
        mvg.add(4.0);
        mvg.add(4.0);
        mvg.add(6.0);
        mvg.add(7.0);
        mvg.add(8.0);

        for( int i = 0; i < mvg.size(); i++){
            StringBuilder str = new StringBuilder()
                    .append(mvg.get(i))
                    .append(" ")
                    .append(mvg.getMovingAverage(i));
            System.out.println(str);
        }
        System.out.println(mvg.getMovingAverage());
    }
}

