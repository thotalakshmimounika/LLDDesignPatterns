package StrategyDesignPattern;

public class client {
      public static void main(String[] args) {
          GoogleMaps gm = new GoogleMaps();
          gm.findPathByMode(TravelMode.BIKE);
      }
}
