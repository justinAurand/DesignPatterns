public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(Pizzas pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        String chicagoStyle = "Chicago Style";

        if (pizzaType.equals(Pizzas.Cheese)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Cheese Pizza");
        } else if (pizzaType.equals(Pizzas.Veggie)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Veggie Pizza");
        } else if (pizzaType.equals(Pizzas.Clam)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Clam Pizza");
        } else if (pizzaType.equals(Pizzas.Pepperoni)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Pepperoni Pizza");
        }

        return pizza;
    }
}
