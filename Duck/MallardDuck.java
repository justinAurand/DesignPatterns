public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    public void Display() {
        System.out.println("I'm a real Mallard duck");
    }
}
