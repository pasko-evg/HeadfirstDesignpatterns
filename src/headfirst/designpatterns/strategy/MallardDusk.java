package headfirst.designpatterns.strategy;

public class MallardDusk extends Duck {
    public MallardDusk() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Dusk");
    }
}
