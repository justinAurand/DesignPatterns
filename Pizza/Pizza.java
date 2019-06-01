import java.util.ArrayList;

public abstract class Pizza {
    String name;
    Dough dough;
    Sauce sauce;
    Veggies[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    abstract void prepare();

    void bake() {
        System.out.println("Baking for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Placing pizza in official PizzaStore box");
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        StringBuilder builder = new StringBuilder(name + "\n");
        builder.append(dough.getName() + "\n");
        builder.append(sauce.getName() + "\n");
        builder.append(cheese.getName() + "\n");

        if (veggies != null && veggies.length > 0) {
            builder.append("Veggies:\n");
            for (Veggies veggie : veggies) {
                builder.append("  " + veggie.getName() + "\n");
            }
        }

        if (pepperoni != null) {
            builder.append(pepperoni.getName() + "\n");
        }
        if (clams != null) {
            builder.append(clams.getName() + "\n");
        }

        return builder.toString();
    }
}
