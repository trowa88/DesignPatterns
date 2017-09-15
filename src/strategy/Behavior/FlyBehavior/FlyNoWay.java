package strategy.Behavior.FlyBehavior;

import strategy.Behavior.FlyBehavior.FlyBehavior;

public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("저는 못 날아요");
    }
}
