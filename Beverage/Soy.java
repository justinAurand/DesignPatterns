public class Soy extends CondimentDecorator {
    Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return beverage.cost() + soyCost();
    }

    private double soyCost() {
        Size size = beverage.getSize();
        if (size == Size.Venti)
            return 0.20;
        if (size == Size.Grande)
            return 0.15;
        return 0.10;
    }
}
