public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan received...\n" + pizza.toString());

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel received...\n" + pizza.toString());

        pizza = nyStore.orderPizza("clam");
        System.out.println("Sebastian received...\n" + pizza.toString());

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Jeffy received...\n" + pizza.toString());
    }
}
