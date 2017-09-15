package strategy.Behavior.QuackBehavior;

import strategy.Behavior.QuackBehavior.QuackBehavior;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("삑");
    }
}
