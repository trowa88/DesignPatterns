package factory.pizzaStore;

import factory.ingredient.NYPizzaIngredientFactory;
import factory.ingredient.ingredientInterface.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (item.equals("veggie")) {
            return null;
        } else if (item.equals("clam")) {
            return null;
        } else if (item.equals("pepperoni")) {
            return null;
        }

        return pizza;
    }
}
