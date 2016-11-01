public abstract class Duck {
    public Duck() { }

    public abstract void Display();

    public void performFly() { }
    public void performQuick() { }
    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }
}
