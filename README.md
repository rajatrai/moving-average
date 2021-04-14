# moving-average


The solution separates the storage of items( and their corresponding moving average), 
and the calculation logic in two separate interfaces. Both concrete implementations can be independent of 
each other.

The example implementation `MovingAverageContainer` uses ArrayList<> for storage of items and the corresponding moving
average. It memoize the moving averages for every new item added. The constructor of `MovingAverageContainer` needs an instance of concrete implementation of calculation
interface `IMovingAverageCalculator`. 

Example implementation `MovingAverageCalculator` needs size of the moving window (number of items for 
moving average - N), and calculates simple moving average.

For demonstration, sample code is added in Main.java:

```java
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
```
