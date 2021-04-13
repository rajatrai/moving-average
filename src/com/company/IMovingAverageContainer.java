package com.company;

/**
 * IMovingAverageContainer interface defines abstract methods for
 * adding or getting items, or getting moving average
 * */
public interface IMovingAverageContainer {
    /**
     * This function is expected to return the Moving Average based on the implementation class
     * @param index - Index of the item in input data
     * @return - Moving Average when the item at given index was added
     */
    public Double getMovingAverage(int index);

    /**
     * This function is expected to return the latest Moving Average based on the implementation class
     * @return - Latest Moving Average (i.e. Moving average when last item was added)
     */
    public Double getMovingAverage();

    /**
     * This function returns the item at given index in input data
     * @param index
     * @return - Item at given index
     */
    public Double get(int index);

    /**
     * Add item to the input data, similar to Collections.add
     * @param num - Value of the item: Double
     * @return - status as expected from Collections.add
     */
    public boolean add(Double num);

    /**
     * number of items added to input data
     * @return
     */
    public int size();
}
