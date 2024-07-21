package DecoratorDesignPattern;

public class Client {
    public static void main(String[] args) {
        //Double Mocha + Dark Roast  with Added Milk
        Beverage b = new DarkRoast();
//        System.out.println(b.getCost());
        b = new Mocha(b);
        b = new Mocha(b);
        b = new Milk(b);

        b.getDescription();
    }
}
