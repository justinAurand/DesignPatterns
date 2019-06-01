public class NyPizzaStore extends PizzaStore {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NyPizzaIngredientFactory();
        String newYorkStyle = "New York Style";

        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Cheese Pizza");
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Veggie Pizza");
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Clam Pizza");
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName(newYorkStyle + " Pepperoni Pizza");
        }

        return pizza;
    }
}
