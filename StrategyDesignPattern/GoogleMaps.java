package StrategyDesignPattern;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode){
        PathCalculatorStrategy p = PathCalculatorStrategyFactory.FindPathCalculatorStrategyByMode(travelMode);
        p.findpath();
    }
}
