package com.company;

import java.util.List;

/**
 * IMovingAverageCalculator interface defines abstract methods needed
 * to implement a moving average calculator
 */
public interface IMovingAverageCalculator {
    /**
     * Calculate moving average for the last item added
     * @return - calculated moving average for last item in inputData
     */
    public Double calculateMovingAverage(List<Double> inputData);
}
