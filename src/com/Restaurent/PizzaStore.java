package com.Restaurent;

import com.Restaurent.factory.IFactory;
import com.Restaurent.pizza.IPizza;

public class PizzaStore {

    private final IFactory factory;

    public PizzaStore(IFactory factory) {
        this.factory = factory;
    }

    public void OrderPizza(String pizzaName) throws Exception {
        IPizza pizza = this.factory.createPizza(pizzaName);

        pizza.prepare();
        pizza.bake();
        pizza.box();
    }
}
