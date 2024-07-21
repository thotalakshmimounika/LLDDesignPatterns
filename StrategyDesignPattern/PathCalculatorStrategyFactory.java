package StrategyDesignPattern;

public class PathCalculatorStrategyFactory {
    static PathCalculatorStrategy FindPathCalculatorStrategyByMode(TravelMode travelMode ) {
        PathCalculatorStrategy p = null;
        if(travelMode.equals(travelMode.BIKE)){
            p = new BikePathCalculatorStrategy();
        }
        else if (travelMode.equals(travelMode.CAR)){
           p = new CarPathCalculatorStrategy();
        }
        else if (travelMode.equals(travelMode.WALK)){
            p = new WalkPathCalculatorStrategy();
        }
        return p;
    }
}
