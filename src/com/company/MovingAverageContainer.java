package com.company;

import java.util.ArrayList;
import java.util.List;

/**
 * MovingAverageContainer implementation using ArrayList and to to
 * store item as inputData and moving average when item was added as movingAverage
 */
public class MovingAverageContainer implements IMovingAverageContainer {
    private final List<Double> movingAverage = new ArrayList<>();
    private final List<Double> inputData = new ArrayList<>();

    // separates implementation to calculate moving average
    private final IMovingAverageCalculator movingAverageCalculator;


    // Initialize movingAverageCalculator in Ctor
    public MovingAverageContainer(IMovingAverageCalculator movingAverageCalculator) {
        this.movingAverageCalculator = movingAverageCalculator;
    }

    /**
     * Get calculated & memoized moving average
     * @param index - Index of the item in input data
     * @return
     */
    @Override
    public Double getMovingAverage(int index) {
        return movingAverage.get(index);
    }

    @Override
    public Double getMovingAverage() {
        return movingAverage.get(this.movingAverage.size() -1);
    }

    @Override
    public Double get(int index) {
        return inputData.get(index);
    }

    @Override
    public int size() {
        return inputData.size();
    }

    /**
     * Add item to input data, and its calculated moving average using
     * IMovingAverageCalculator.calculateMovingAverage
     *
     * @param num - Value of the item: Double
     * @return true indicates item is added, similar to Collection.add
     */
    @Override
    public boolean add(Double num){
        inputData.add(num);
        movingAverage.add(movingAverageCalculator.calculateMovingAverage(inputData));
        return true;
    }

}
