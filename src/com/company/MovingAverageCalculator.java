package com.company;

import java.util.List;

/**
 * Calculates simple moving average, an implementation
 * that needs - number of items for moving average as movingAverageWindow
 *
 */
public class MovingAverageCalculator implements IMovingAverageCalculator {
    private final int movingAverageWindow;
    private double cumulativeMovingWindowSum;
    // For convenience, but to make call to calculateMovingAverage idempotent
    private int lastItemIndexInCumulativeMovingWindowSum = -1;

    public MovingAverageCalculator(int movingAverageWindow) {
        this.movingAverageWindow = movingAverageWindow;
    }

    /**
     * Calculates simple moving average for the input data.
     * For first few items, if the total number of item is less than movingAverageWindow, we
     * want to calculate average of only total number of items available
     * example: input = [ 1, 2, 3, 4] , and movingAverageWindow = 2
     *          movingAverage = [ (1/1), (1+2)/2, (2+3)/2, (3+4)/2 ]
     */
    @Override
    public Double calculateMovingAverage(List<Double> inputData) {
        if ( lastItemIndexInCumulativeMovingWindowSum < inputData.size()){
            lastItemIndexInCumulativeMovingWindowSum++;
            cumulativeMovingWindowSum += inputData.get(inputData.size() -1);
            if (inputData.size() > movingAverageWindow){
                cumulativeMovingWindowSum -= inputData.get(inputData.size() - movingAverageWindow -1 );
            }
        }
        return cumulativeMovingWindowSum / Math.min(inputData.size(), movingAverageWindow);
    }
}
