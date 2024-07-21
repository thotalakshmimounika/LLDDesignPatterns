package StrategyDesignPattern;

public class CarPathCalculatorStrategy implements  PathCalculatorStrategy{

    @Override
    public void findpath() {
        System.out.println("Car Path is being Calculated");
    }
}
