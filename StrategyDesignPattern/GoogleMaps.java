package StrategyDesignPattern;

public class GoogleMaps {
    void findPathByMode(TravelMode travelMode){
        if(travelMode.equals(travelMode.BIKE)){
            System.out.println("Finding the path for bike");
        }
        else if (travelMode.equals(travelMode.CAR)){
            System.out.println("Finding the path for car");
        }
        else if (travelMode.equals(travelMode.WALK)){
            System.out.println("Finding the path for walk");
        }
    }
}
