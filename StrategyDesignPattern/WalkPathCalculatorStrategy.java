package StrategyDesignPattern;

public class WalkPathCalculatorStrategy implements PathCalculatorStrategy{
    @Override
    public void findpath() {
        System.out.println("Walth Path is being Calculated");
    }
}
