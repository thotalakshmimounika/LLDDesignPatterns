package StrategyDesignPattern;

public class BikePathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findpath() {
        System.out.println("Bike Path is being Calculated");
    }
}
