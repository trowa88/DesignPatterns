package strategy;

import strategy.Behavior.FlyBehavior.FlyRocketPowered;
import strategy.Ducks.Duck;
import strategy.Ducks.MallardDuck;
import strategy.Ducks.ModelDuck;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
