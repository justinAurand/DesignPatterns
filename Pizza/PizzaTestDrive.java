public class PizzaTestDrive {
    public static void main(String[] args) {
        PizzaStore nyStore = new NyPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(Pizzas.Veggie);
        System.out.println("Ethan received...\n" + pizza.toString());

        pizza = chicagoStore.orderPizza(Pizzas.Veggie);
        System.out.println("Joel received...\n" + pizza.toString());

        pizza = nyStore.orderPizza(Pizzas.Clam);
        System.out.println("Sebastian received...\n" + pizza.toString());

        pizza = chicagoStore.orderPizza(Pizzas.Pepperoni);
        System.out.println("Jeffy received...\n" + pizza.toString());
    }
}
