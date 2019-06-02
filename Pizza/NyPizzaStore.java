public class NyPizzaStore extends PizzaStore {
    public Pizza createPizza(Pizzas pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        String newYorkStyle = "New York Style";

        if (pizzaType.equals(Pizzas.Cheese)) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Cheese Pizza");
        } else if (pizzaType.equals(Pizzas.Veggie)) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Veggie Pizza");
        } else if (pizzaType.equals(Pizzas.Clam)) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Clam Pizza");
        } else if (pizzaType.equals(Pizzas.Pepperoni)) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Pepperoni Pizza");
        }

        return pizza;
    }
}
