public class ChicagoPizzaStore extends PizzaStore {
    public Pizza createPizza(String pizzaType) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();
        String chicagoStyle = "Chicago Style";

        if (pizzaType.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Cheese Pizza");
        } else if (pizzaType.equals("veggie")) {
            pizza = new VeggiePizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Veggie Pizza");
        } else if (pizzaType.equals("clam")) {
            pizza = new ClamPizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Clam Pizza");
        } else if (pizzaType.equals("pepperoni")) {
            pizza = new PepperoniPizza(ingredientFactory);
            pizza.setName(chicagoStyle + " Pepperoni Pizza");
        }

        return pizza;
    }
}
