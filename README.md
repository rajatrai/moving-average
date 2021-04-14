# moving-average


The solution separates the storage of items( and their corresponding moving average), 
and the calculation logic in two separate interfaces. Both concrete implementations can be independent of 
each other.

The example implementation `MovingAverageContainer` uses ArrayList<> for storage of items and the corresponding moving
average. It memoize the moving averages for every new item added. The constructor of `MovingAverageContainer` needs an instance of concrete implementation of calculation
interface `IMovingAverageCalculator`. 

Example implementation `MovingAverageCalculator` needs size of the moving window (number of items for 
moving average - N), and calculates simple moving average.
