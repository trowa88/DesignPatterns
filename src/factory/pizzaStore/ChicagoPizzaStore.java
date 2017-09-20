package factory.pizzaStore;

import factory.ingredient.ChicagoPizzaIngredientFactory;
import factory.ingredient.ingredientInterface.PizzaIngredientFactory;
import factory.pizza.CheesePizza;
import factory.pizza.Pizza;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String item) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if (item.equals("cheese")) {
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        }

        return pizza;
    }
}
