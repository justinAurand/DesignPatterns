public class OrderCoffee {
    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        printReceipt(beverage);

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        printReceipt(beverage2);

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        printReceipt(beverage3);
    }

    private static void printReceipt(Beverage beverage) {
        System.out.println(beverage.getDescription() +
            ": $" + beverage.cost());
    }
}
