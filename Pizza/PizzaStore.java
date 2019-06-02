public abstract class PizzaStore {
    public Pizza orderPizza(Pizzas pizzaType) {
        Pizza pizza;
        pizza = createPizza(pizzaType);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(Pizzas pizzaType);
}
